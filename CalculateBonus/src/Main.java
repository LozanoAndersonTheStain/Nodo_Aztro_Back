//Libraries
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

//Models
import domains.Person;
import models.salaried.Salaried;
import models.staff.AdministrativeStaff;
import models.volunteer.Volunteer;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Salaried("Anderson", "Lozano", 22, "12345678", "Calle 123", 1000000));
        persons.add(new Volunteer("Dana", "Carmely", 26, "10111213", "Calle 456"));
        persons.add(new AdministrativeStaff("Carlos", "Fernandez", 30, "98765432", "Calle 789", 1500000));

        DecimalFormat salaryFormat = new DecimalFormat("#,###.##");

        for(Person person : persons) {
            System.out.println("Name: " + person.getName() + " " + person.getLastName() + " - DNI: " + person.getDni());
            System.err.println("Role: " + person.getRole());

            if (person.getSalary() > 0) {
                String formattedSalary = salaryFormat.format(person.getSalary());
                System.out.println("Salary " + formattedSalary);
            } else {
                System.out.println("Salary: No Salary");
            }

            float bonus = person.calculateBonus();
            String formattedBonus = salaryFormat.format(bonus);
            System.out.println("Bonus: " + formattedBonus + "\n");
        }
    }
}