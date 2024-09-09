package models.teachers;

public class FullTeacher extends Teacher {

    private int yearsOfExperience;

    public FullTeacher(String name, String lastName, int age, String dni, String address, float salary) {
        super(name, lastName, age, dni, address, salary);
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String getRole() {
        return "Full-Time Teacher";
    }
}
