package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String married;

    public Doctor(String name,String surname, String education, String  birthday,String married) {
        super(name, surname, education, birthday);
        this.married = married;
    }

    public void DiagnosisHeal(Doctor Doctor) {
    }
}
