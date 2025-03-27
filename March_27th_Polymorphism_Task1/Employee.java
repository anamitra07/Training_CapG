package March_27th_Polymorphism_Task1;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void employeeInfo() {
        System.out.println("Employee name: "+this.name);
        System.out.println("Employee salary: "+this.salary);
    }

    public void jobRole() {

    }
}
