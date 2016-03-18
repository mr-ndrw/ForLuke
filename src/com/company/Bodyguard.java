package com.company;

/**
 * Created by Luke on 10.03.2016.
 */
public class Bodyguard extends Person {
    private String weapon;
    private EmploymentType czasPracy;

    public Bodyguard(String imie, String nazwisko, String weapon, EmploymentType czasPracy) {
        super(imie, nazwisko);
        this.weapon = weapon;
        this.czasPracy = czasPracy;
    }

    @Override
    public String getVerb() {
        return "protects";
    }

    @Override
    public String getFurtherDescription() {
        return ". " + this.getImie() + " has a " + this.weapon;
    }
}
