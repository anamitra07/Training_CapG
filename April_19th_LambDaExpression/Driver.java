package April_19th_LambDaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // adding Employee type objects inside array list
        employees.add(new Employee(3,"Ram"));
        employees.add(new Employee(1,"Rohit"));
        employees.add(new Employee(2,"Raj"));

        // using Lambda Expression to sort based on name
        Comparator<Employee> c = (o1, o2) -> o1.name.compareTo(o2.name);
        Collections.sort(employees, c);

        System.out.println(employees);
    }
}
