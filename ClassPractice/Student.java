package ClassPractice;

public class Student {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id+" "+name+" "+marks;
    }

    public int compareTo(Object o) {
        Student s = (Student) o;
        return this.id-s.id;
    }
}
