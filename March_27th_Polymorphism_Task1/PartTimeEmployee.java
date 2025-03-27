package March_27th_Polymorphism_Task1;

public class PartTimeEmployee extends Employee{
    private int workingHours;

    public PartTimeEmployee(String name, double salary, int workingHours) {
        super(name, salary);
        this.workingHours = workingHours;
    }

    public void employeeInfo() {
        super.employeeInfo();
        System.out.println("Working Hours: "+this.workingHours);
    }

    public void jobRole() {
        System.out.println("Job Role: Cloud Engineer");
    }

    public void getDesignation() {
        System.out.println("Designation: Associate Software Engineer");
    }
}
