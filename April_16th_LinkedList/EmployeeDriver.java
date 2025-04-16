package April_16th_LinkedList;

import java.util.*;

public class EmployeeDriver {
    public static void main(String[] args) {

        // creating an ArrayList of Employee type.
        LinkedList<Employee> employees = new LinkedList<>();

        // adding Employee type objects inside array list
        employees.push(new Employee(2,"Ram"));
        employees.push(new Employee(1,"Raj"));
        employees.push(new Employee(3,"Rohit"));

        employees.push(new Employee(4,"Naveen"));

        System.out.println("\nInitial list: ");
        for(Employee e: employees) {
            System.out.println(e);
        }
        employees.addFirst(new Employee(5,"Dharmesh"));

        employees.pop();

        System.out.println("\nElement at top is: "+employees.peek());

        // Using iterator object

        Iterator<Employee> emp = employees.iterator();

        // Sorting an Linked List

        // Sorting based on id
        Collections.sort(employees);
        System.out.println("\nSorting based on id: ");
        System.out.println(employees);

        // Sorting based on name
        CompareByName comparatorObject = new CompareByName();
        Collections.sort(employees, comparatorObject);
        System.out.println("\nSorting based on name: ");
        System.out.println(employees);


        // List Iterator

        ListIterator<Employee> list = employees.listIterator();

        //traversing in forward direction
        while(list.hasNext()) {
            System.out.println("\nIndex: "+list.nextIndex()+"  "+"Element: "+list.next());
        }
    }
}
