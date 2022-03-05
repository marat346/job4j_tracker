package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String concrete;


    public Builder (String name, String surname, String education, String birthday, String concrete,String married ) {
        super(name, surname, education, birthday, married);
        this.concrete = concrete;
    }

    public void Floods(Builder Builder){

    }
}
