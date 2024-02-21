package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import ru.job4j.tracker.action.User;

import java.util.List;

public class StartUI {
    private final Output output;

    public StartUI(Output output) {
        this.output = output;
    }

    public void init(Input input, Tracker tracker, List<User> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            System.out.println();
            int select = Integer.parseInt(input.askStr("Выбрать: "));
            if (select < 0 || select >= actions.size()) {
                output.println("Неверный ввод, вы можете выбрать: 0 .. " + (actions.size() - 1));
                continue;
            }
            User action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<User> actions) {
        output.println("Меню: ");
        for (int i = 0; i < actions.size(); i++) {
            output.println(i + ". " + actions.get(i).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        User[] actions = {
                new Create(output),
                new FindAll(output),
                new Replace(output),
                new Delete(output),
                new FindById(output),
                new FindByName(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, List.of(actions));
    }
}
