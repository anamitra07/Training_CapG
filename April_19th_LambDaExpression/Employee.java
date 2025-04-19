package April_19th_LambDaExpression;

public class Employee implements Comparable<Employee> {
    String name;
    int id;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id+" "+name;
    }

    @Override
    public int compareTo(Employee e) {
        return (this.id-e.id);
    }
}
