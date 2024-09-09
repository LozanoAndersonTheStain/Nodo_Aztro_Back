package models.salaried;

import domains.Person;

public class Salaried extends Person {

    public Salaried(String name, String lastName, int age, String dni, String address, float salary) {
        super(name, lastName, age, dni, address, salary);
    }

    @Override
    public String getRole() {
        return "Salaried Employee";
    }
}
