package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book quran = new Book("Коран", 604);
        Book voinaIMir = new Book("Война и мир", 1300);
        Book vavilon = new Book("Самый богатый человек в Вавилоне", 288);
        Book clean = new Book("Clean code", 672);
        Book[] books = new Book[4];
        books[0] = quran;
        books[1] = voinaIMir;
        books[2] = vavilon;
        books[3] = clean;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println("Replace book");
        books[0] = clean;
        books[3] = quran;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println("Show books with the title \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }

}
