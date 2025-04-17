package Aprll_17th_HashSet;

import java.util.Objects;

public class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id+" "+name;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id==s.id && this.name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
