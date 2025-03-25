package March_21st_Static_and_Nonstatic;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 21-03-2025
 Time: 16:09
 ******************************/
public class Demo1 {
    static int id = 1;
    String name = "Raj";

    public Demo1() {
        System.out.println(id);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        System.out.println(id);
        System.out.println(d1.name);
    }

}
