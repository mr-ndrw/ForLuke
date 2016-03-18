package com.company;

/**
 * Created by Luke on 10.03.2016.
 */
public class Student extends Person{
    private String id;
    private String kierunek;

    public Student(String imie, String nazwisko, String id, String kierunek) {
        super(imie, nazwisko);
        this.id = id;
        this.kierunek = kierunek;
    }

    @Override
    public Person serves(Person person) {
        return this;
    }

    @Override
    public String getVerb() {
        return "is looking for";
    }

    @Override
    public String getFurtherDescription() {
        return "at " + kierunek + ".";
    }
}
