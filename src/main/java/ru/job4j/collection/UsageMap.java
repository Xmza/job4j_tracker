package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] dasda) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("paveldurov@tg.ru", "Pavel Durov");
        map.put("ingvarvoitenko@mail.ru", "Igor Voitenko");
        map.put("parsentev@yandex.ru", "Petr Arsentev");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
