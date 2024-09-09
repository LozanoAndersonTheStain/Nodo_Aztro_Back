package models.volunteer;

public class MemberVolunteer extends Volunteer {

    public MemberVolunteer(String name, String lastName, int age, String dni, String address) {
        super(name, lastName, age, dni, address);
    }

    @Override
    public String getRole() {
        return "Member Volunteer";
    }
}
