package models.staff;

import models.salaried.Salaried;

public class AdministrativeStaff extends Salaried {

    public AdministrativeStaff(String name, String lastName, int age, String dni, String address, float salary) {
        super(name, lastName, age, dni, address, salary);
    }

    @Override 
    public String getRole() {
        return "Administrative Staff";
    }
}
