package March_21st_OOPS;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 21-03-2025
 Time: 10:36
 ******************************/
public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Raj";
        s1.collegeName= "UEM";
        s1.id = 1;
        s1.marks = 89.67;
        System.out.println(s1.name+"  "+s1.collegeName+"  "+s1.id+"  "+ s1.marks);
        s1.study();

        System.out.println("----------------------------------------------------");
        
    }
}
