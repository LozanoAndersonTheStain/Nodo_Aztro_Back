package domains;

public abstract class Person {

    private String name;
    private String lastName;
    private int age;
    protected String dni;
    protected String address;
    private double salary;

    public Person(String name, String lastName, int age, String dni, String address, double salary) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dni = dni;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }

    public String getDni() {
        return dni;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public abstract String getRole(); 
}

