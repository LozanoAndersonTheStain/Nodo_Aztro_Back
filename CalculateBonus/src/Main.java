import models.salaried.Salaried;

public class Main {
    public static void main(String[] args) {
        Salaried Asalariado = new Salaried("Anderson", "Lozano", 22, "12345678", "Calle 123", 0);
        System.out.print(Asalariado.getName() + " " + Asalariado.getLastName() + "\n");
        System.out.println("Your salary is: " + Asalariado.getSalary());
    }
}