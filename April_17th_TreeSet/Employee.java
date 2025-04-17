package April_17th_TreeSet;

public class Employee implements Comparable<Employee> {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name+" "+salary;
    }

    @Override
    public int compareTo(Employee e) {
        return (int) (e.salary-this.salary);
    }
}
