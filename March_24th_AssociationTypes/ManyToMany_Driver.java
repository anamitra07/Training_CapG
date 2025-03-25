package March_24th_AssociationTypes;

import java.util.Arrays;

public class ManyToMany_Driver {
    public static void main(String[] args) {
        Student s1 = new Student("Ram",1);
        Student s2 = new Student("Raj",2);

        Course c1 = new Course("Java",1);
        Course c2 = new Course("Python",2);
        Course c3 = new Course("C++",3);

        s1.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c3);
        s2.addCourse(c1);

        System.out.println(Arrays.deepToString(s1.arr) + " " + Arrays.deepToString(s2.arr));
    }
}
