package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String hours;

    public Surgeon (String name,String surname, String education, String  birthday,String married) {
        super(name, surname, education, birthday,married);
        this.hours = hours;
    }

    public void Works (Surgeon Surgeon) {
    }
}
