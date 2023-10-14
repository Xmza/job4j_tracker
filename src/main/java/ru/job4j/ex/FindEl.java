package ru.job4j.ex;

    class ElementNotFoundException extends Exception {
        public ElementNotFoundException(String message) {
            super(message);
        }
    }

    public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] != null && value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Элемент не найден");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = {"up", "down", "left", "right"};
        String key = "dowdn";
        try {
            int in = indexOf(array, key);
            System.out.println(key + " " + in);
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}