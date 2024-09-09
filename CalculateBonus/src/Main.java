//Libraries
import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

//Models
import domains.Person;
import models.salaried.Salaried;
import models.volunteer.Volunteer;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Salaried("Anderson", "Lozano", 22, "12345678", "Calle 123", 1000000));
        persons.add(new Volunteer("Dana", "Carmely", 26, "10111213", "Calle 456"));

        DecimalFormat salaryFormat = new DecimalFormat("#,###.##");

        for(Person person : persons) {
            System.out.println("Name: " + person.getName() + " " + person.getLastName() + " - DNI: " + person.getDni());
            System.err.println("Role: " + person.getRole());
            
            String formattedSalary = salaryFormat.format(person.getSalary());
            System.out.println("Salary " + formattedSalary);
        }
    }
}