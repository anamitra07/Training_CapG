package March_27th_Polymorphism_Task1;

public class FullTimeEmployee extends Employee {
    private int bonus;

    public FullTimeEmployee(String name, double salary, int bonus) {
        super(name,salary);
        this.bonus = bonus;
    }
    public void employeeInfo() {
        super.employeeInfo();
        System.out.println("Bonus received: "+ this.bonus);
    }

    public void jobRole() {
        System.out.println("Job Role: Software Developer");
    }
}
