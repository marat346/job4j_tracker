package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String married;

    public Engineer(String name, String surname, String education, String birthday, String married) {
      super(name, surname, education, birthday);
        this.married = married;
    }


    public void DraftDraws(Object object){
    }
}
