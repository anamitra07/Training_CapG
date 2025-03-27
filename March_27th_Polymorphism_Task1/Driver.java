package March_27th_Polymorphism_Task1;

public class Driver {
    public static void main(String[] args) {

        // Upcasting in Polymorphism
        System.out.println("\nFull Time Employee: ");
        Employee emp1 = new FullTimeEmployee("Ram Ray", 50000, 5000);
        emp1.employeeInfo();
        details(emp1);

        // Downcasting in Encapsulation
        if (emp1 instanceof FullTimeEmployee) {
            FullTimeEmployee fte = (FullTimeEmployee) emp1;
            fte.jobRole();
        }

        // Upcasting in Polymorphism
        System.out.println("\nPart Time Employee: ");
        Employee emp2 = new PartTimeEmployee("Raj Ray", 20000, 20);
        emp2.employeeInfo();
        details(emp2);
    }

    static void details(Employee e) {
        if(e instanceof FullTimeEmployee) {
            e.jobRole();
        }
        else {
            e.jobRole();
            ((PartTimeEmployee)e).getDesignation();
        }
    }
}

