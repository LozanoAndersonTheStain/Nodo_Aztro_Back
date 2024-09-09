package models.volunteer;

public class ExternalVolunteer extends Volunteer {

    public ExternalVolunteer(String name, String lastName, int age, String dni, String address) {
        super(name, lastName, age, dni, address);
    }

    @Override
    public String getRole() {
        return "External volunteer";
    }
}
