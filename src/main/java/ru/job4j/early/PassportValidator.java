package ru.job4j.early;

public class PassportValidator {
    public static boolean validate(String password) {
        boolean rsl = true;
        char tot = (char) Integer.parseInt(password);
        if (password == null) {
            if ((tot > 8) || (tot < 32)) {
                throw new IllegalArgumentException("Ошибка при вводе пароля");

            }
            String[] temp = {"qwerty", "12345", "password", "admin", "user"};
        }
        boolean[] flagi = new boolean[]{Character.isLowerCase(tot), Character.isDigit(tot), Character.isUpperCase(tot)};
        throw new IllegalArgumentException("Ошибка при вводе пароля");
    }
}