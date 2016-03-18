package com.company;

/**
 * Created by Luke on 10.03.2016.
 */
public class Teacher extends Person {
    private String id;
    private String nazwaPraca;
    private String wydzialPraca;
    private EmploymentType czasPracy;

    public Teacher(String imie, String nazwisko, String id, String nazwaPraca, String wydzialPraca, EmploymentType czasPracy) {
        super(imie, nazwisko);
        this.id = id;
        this.nazwaPraca = nazwaPraca;
        this.wydzialPraca = wydzialPraca;
        this.czasPracy = czasPracy;
    }

    @Override
    public String getVerb() {
        return "teaches";
    }

    @Override
    public String getFurtherDescription() {
        return " at " + nazwaPraca + ".";
    }
}
