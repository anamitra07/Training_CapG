package April_4th_Comparable_and_Comparator;

public class Employee implements Comparable{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id+" "+name+" "+salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        return this.name.compareTo(e.name);
    }

//    @Override
//    public int compareTo(Object o) {
//        Employee e = (Employee) o;
//        return (int) (this.salary-e.salary);
//    }
}
