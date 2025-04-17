package April_17th_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeDriver {
    public static void main(String[] args) {
        TreeSet<Employee> set = new TreeSet<>(new CompareByName());

        set.add(new Employee("Ram",30000));
        set.add(new Employee("Raj",10000));
        set.add(new Employee("Rohit",20000));

        Iterator<Employee> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
