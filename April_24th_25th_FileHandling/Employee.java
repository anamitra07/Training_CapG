package April_24th_25th_FileHandling;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int id;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {

        return id+" "+name+" "+age;
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
    public double getAge() {
        return this.age;
    }
}
