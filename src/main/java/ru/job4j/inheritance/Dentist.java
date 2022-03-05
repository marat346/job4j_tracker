package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String tooth;

    public Dentist (String name,String surname, String education, String  birthday,String married) {
        super(name, surname, education, birthday,married);
        this.tooth = tooth;
    }

    public void Heals(Dentist dentist) {
    }
}
