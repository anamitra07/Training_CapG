package March_24th_AssociationTypes;

public class Course {
    String name;
    Student[] students;

    Course(String name, int size) {
        this.name = name;
        this.students = new Student[size];
    }
}
