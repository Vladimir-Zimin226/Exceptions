package org.example;

public class Authorization {
    public static void checkAutorizations(String login, String password, String confirmPassword)
            throws WrongPasswordException {
        if (!stringCorrect(login)) {
            throw new WrongLoginException("Логин указан неверно!");
        }
        if (stringCorrect(password) && password.equals(confirmPassword)) {
            System.out.println("Логин и пароль указаны корректно");
        } else {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }

    private static boolean stringCorrect(String checkString) {
        if (checkString == null
                || checkString.isBlank()
                || checkString.length() > 20) {
            return false;
        }
        return checkString.matches("[a-zA-Z0-9_]*");
    }
}
