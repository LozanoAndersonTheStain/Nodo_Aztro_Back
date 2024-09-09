package models.teachers;

import models.salaried.Salaried;

public class Teacher extends Salaried {    

    public Teacher(String name, String lastName, int age, String dni, String address, float salary) {
        super(name, lastName, age, dni, address, salary);
    }

    @Override
    public String getRole() {
        return "Teacher";
    }
}
