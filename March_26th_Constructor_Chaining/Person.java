package March_26th_Constructor_Chaining;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.print("Name: " + this.name + "\n" + "Age: " + this.age);
    }
}
