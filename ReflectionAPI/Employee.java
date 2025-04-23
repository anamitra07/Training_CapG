package ReflectionAPI;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private int age;

    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+salary+" "+age;
    }

    @Deprecated
    public int getId() {
        return this.id;
    }

    @Deprecated
    public String getName() {
        return this.name;
    }

    @Deprecated
    public double getSalary() {
        return this.salary;
    }

    @Deprecated
    public int getAge() {
        return this.age;
    }
}
