package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luke on 10.03.2016.
 */
public abstract class Person {
    private String imie;
    private String nazwisko;

    private List<Person> servedPeople = new ArrayList<>();

    public Person(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void showOneLevelDependencies(){
        StringBuilder sb = new StringBuilder();
        sb.append(imie);
        sb.append(" " + getVerb());

        if (servedPeople.isEmpty()){
            sb.append(" noone " + getFurtherDescription());
            System.out.println(sb.toString());
            return;
        }

        for(Person servedPerson : servedPeople){
            String nameToAppend = this == servedPerson ? " himself" : (" " + servedPerson.getImie());
            sb.append(nameToAppend);
            if (!(servedPeople.get(servedPeople.size() - 1) == servedPerson)){
                sb.append(" and ");
            }
        }
            sb.append(this.getFurtherDescription());

        System.out.println(sb.toString());
    }

    /**
     * @return This instance.
     */
    public Person serves(Person person){
        if (person == null) {
            throw new NullPointerException("Provided Person cannot be null.");
        }

        servedPeople.add(person);

        return this;
    }

    public abstract String getVerb();
    public abstract String getFurtherDescription();

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
