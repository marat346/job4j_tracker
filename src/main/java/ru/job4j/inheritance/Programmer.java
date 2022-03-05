package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String words;

    public Programmer (String name, String surname, String education, String birthday, String words,String married ) {
        super(name, surname, education, birthday,married);
        this.words = words;
    }

    public void Writes(Programmer programmer){

    }
}
