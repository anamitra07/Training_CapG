package Aprll_17th_HashSet;

import java.util.HashSet;

public class StudentDriver {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        set.add(new Student(1,"Ram"));
        set.add(new Student(2,"Raj"));
        set.add(new Student(2,"Raj"));
        set.add(new Student(3,"Rohit"));

        for(Student st: set) {
            System.out.println(st);
        }
    }
}
