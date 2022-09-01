package ru.job4j.early;

public class PassportValidator {
    public static boolean validate(String password) {
        boolean rsl = true;
        char tot = (char) Integer.parseInt(password);
        if ((tot > 8 || tot < 32)
                || Character.isUpperCase(tot)
                || Character.isLowerCase(tot)
                || Character.isLowerCase(tot)
                || Character.isDigit(tot)) {
            System.out.println("Пароль валидный");
            return rsl;
        }
        throw new IllegalArgumentException("Ошибка при вводе пароля");
    }

    public static void main(String[] args) {
        PassportValidator.validate("5");
    }
}


