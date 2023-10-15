package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден!");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользовательный ввел неправильное имя");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr", true)
        };

        try {
            User user = findUser(users, "Petr");
            validate(user);
            System.out.println("This user has an access");
        } catch (UserNotFoundException e) {
            System.out.println("Пользователь не найден!");
        } catch (UserInvalidException e) {
            System.out.println("Пользовательный ввел неправильное имя");
        }
    }
}