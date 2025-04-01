package April_1st_Object_and_String_Class;

import java.util.Objects;

public class Student {
    String name;
    int id;
    String gender;
    double marks;

    public Student(String name, int id, String gender, double marks) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name+" "+this.gender+" "+this.marks;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) {
            return true;
        }
        if(o == null || getClass()!=o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return id== student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
