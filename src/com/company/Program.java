package com.company;

/**
 * Created by Luke on 10.03.2016.
 */
public class Program {
    public static void main(String[]s){
        Person p1 = new Student("Mark", "Twain", "s11111", "Sztuka Nowych Mediów");
        Person p2 = new Teacher("Adam", "Smyk", "01234567890", "PJATK", "Katedra Obliczeń Równoległych", EmploymentType.PART_TIME_JOB);
        Person p3 = new Bodyguard("John", "Rambo", "Shotgun", EmploymentType.FULL_TIME_JOB);

        p3.serves(p2.serves(p1.serves(p2).serves(p3)).serves(p3)).serves(p3);

        System.out.println("Tekst 1:");
        p3.showOneLevelDependencies();
        System.out.println("Tekst 2:");
        p2.showOneLevelDependencies();
        System.out.println("Tekst 3:");
        p1.showOneLevelDependencies();
    }
}
