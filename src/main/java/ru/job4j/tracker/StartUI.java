package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import ru.job4j.tracker.action.User;

public class StartUI {
    private final Output output;

    public StartUI(Output output) {
        this.output = output;
    }

    public void init(Input input, Tracker tracker, User[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            System.out.println();
            int select = Integer.parseInt(input.askStr("Выбрать: "));
            User action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(User[] actions) {
        output.println("Меню: ");
        for (int i = 0; i < actions.length; i++) {
            output.println(i + ". " + actions[i].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
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
        new StartUI(output).init(input, tracker, actions);
    }
}
