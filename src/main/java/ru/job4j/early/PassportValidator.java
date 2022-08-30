package ru.job4j.early;

public class PassportValidator {
    public static boolean validate(String password) {
        boolean rsl = true;
        if (!(Character.isUpperCase(Integer.parseInt(password))
                && Character.isLowerCase(Integer.parseInt(password))
                && Character.isLowerCase(Integer.parseInt(password))
                && Character.isDigit(Integer.parseInt(password)))) {
            throw new IllegalArgumentException("Ошибка при вводе пароля");
        }
        return rsl;
    }
}


