package ru.job4j.tracker.action;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Output;
import ru.job4j.tracker.Tracker;

public class Delete implements User {
    private final Output output;

    public Delete(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Удаление заявки ===");
        int id = Integer.parseInt(input.askStr("Введите id: "));
        Item item = tracker.findById(id);
        tracker.delete(id);
        output.println(item != null ? "Заявка успешно удалена" : "Ошибка удаления заявки");
        return true;
    }
}
