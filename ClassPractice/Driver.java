package ClassPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();

        stud.add(new Student(1,"Ram",80));
        stud.add(new Student(2,"Raj",60));
        stud.add(new Student(3,"Rohit",70));
        stud.add(new Student(4,"Naveen",90));

        // Sorting based on
        Collections.sort(stud,null);
        System.out.println(stud);


    }
}
