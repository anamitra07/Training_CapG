package April_1st_Object_and_String_Class;

public class DriverStud {
    public static void main(String[] args) {
        Student student1 = new Student("Ram",1,"male",69.96);
        Student student2 = new Student("Raj",2,"male",96.69);

        System.out.println(student1);
        System.out.println(student1);

        System.out.println("Are student1 and student2 equal? " + student1.equals(student2));

        System.out.println("Hash Code of student1: "+student1.hashCode());
    }
}
