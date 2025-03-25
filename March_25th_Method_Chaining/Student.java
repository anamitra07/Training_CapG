package March_25th_Method_Chaining;

public class Student {
    String name;
    int id;

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public void display() {
        System.out.println(this.name + " " + this.id);
    }

}
