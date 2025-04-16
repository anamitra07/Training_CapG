package April_14th_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class EmployeeDriver {
    public static void main(String[] args) {

        // creating an ArrayList of Employee type.
        ArrayList<Employee> employees = new ArrayList<>();

        // adding Employee type objects inside array list
        employees.add(new Employee(2,"Ram"));
        employees.add(new Employee(1,"Raj"));
        employees.add(new Employee(3,"Rohit"));

        // Printing list
        for(Employee e : employees) {
            System.out.println(e);
        }

        // Creating ArrayList of Integer type
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        // Removing element and printing list
//        for(int i: a1) {
//            if(i==30) {
//                Integer x = i;
//                a1.remove(x);
//                break;
//            }
//        }
//        System.out.println(a1);

//        Iterator<Integer> itr = a1.iterator();
//        while(itr.hasNext()) {
//            int x = itr.next();
//            if(x==30)
//                itr.remove();
//        }
//        System.out.println(a1);

        Iterator<Employee> emp = employees.iterator();
//        while(emp.hasNext()) {
//            Employee e = emp.next();
//            if(e.name.equals("Raj"))
//                emp.remove();
//        }
//        System.out.println(employees);

        System.out.println("-----------------------------------------------");
        // List Iterator

        ListIterator list = a1.listIterator();

        // traversing in forward direction
//        while(list.hasNext()) {
//            System.out.println("Index: "+list.nextIndex()+"  "+"Element: "+list.next());
//        }

        System.out.println("--------------------------------------------------");

        while(list.hasNext()) {
            if(list.nextIndex()==1) {
                list.add(60);
            }
            int element = (Integer) list.next();
            if(element==20) {
                list.set(100);
            }
        }
        System.out.println(a1);

        // Sorting an ArrayList

        ArrayList<Integer> a2 = new ArrayList();
        a2.add(25);
        a2.add(10);
        a2.add(18);
        a2.add(5);
        a2.add(13);
        Collections.sort(a2);
        System.out.println(a2);

        System.out.println("---------------------------------------");

        // Sorting based on id
        Collections.sort(employees);
        System.out.println(employees);

        // Sorting based on name
        CompareByName comparatorObject = new CompareByName();
        Collections.sort(employees, comparatorObject);
        System.out.println(employees);
    }
}
