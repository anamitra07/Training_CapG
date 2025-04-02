package April_1st_Object_and_String_Class;

public class Employee implements Cloneable{
    String name;
    int id;
    double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+" "+id+" "+salary;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Employee) {
            Employee e = (Employee) o;
            return this.id==e.id && this.salary==e.salary && this.name.equals(e.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (this.id + this.salary + this.name.hashCode());
    }

}
