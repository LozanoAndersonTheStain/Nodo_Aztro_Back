package models.volunteer;

import domains.Person;

public class Volunteer extends Person {

    public Volunteer(String name, String lastName, int age, String dni, String address) {
        super(name, lastName, age, dni, address, 0);
    }

    @Override
    public String getRole() {
        return "Volunteer";
    }

    @Override
    public float calculateBonus() {
        return 0;
    }
}