package Assignment1;

abstract class Employee {
    private String name;
    private String id;
    private double baseSalary;

    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateNetSalary();

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateNetSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Bonus: " + bonus);
    }
}

class Clerk extends Employee {
    public Clerk(String name, String id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double calculateNetSalary() {
        return getBaseSalary();
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Abhishek Bhattacharjee", "123001", 150000, 46000);
        manager.displayInformation();

        Clerk clerk = new Clerk("Smitha Jain", "456009", 60000);
        clerk.displayInformation();
    }
}