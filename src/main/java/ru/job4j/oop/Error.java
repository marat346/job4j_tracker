package ru.job4j.oop;

public class Error {
    private boolean active;

    private int status;

    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;

        this.status = status;

        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Заявка активная " + active);
        System.out.println("Дата " + status);
        System.out.println("Отправить статус " + message);
    }

    public static void main(String[] args) {

          Error explicitConstructorExplicit = new Error(true, 28012022, "принято");

          Error constructor = new Error();

          explicitConstructorExplicit.printInfo();

          constructor.printInfo();
    }
}
