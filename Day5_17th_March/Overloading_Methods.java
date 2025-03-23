package Day5_17th_March;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 17-03-2025
 Time: 09:47
 ******************************/

public class Overloading_Methods {

    public static void main(String[] args) {
        add(10,20);
        add(10,20,40.2f);
        add(10,20,30,40);
    }

    public static int add(int a, int b) {
        System.out.println("First");
        return a+b;
    }

    public static void add(int a, int b, int c, int d) {
        System.out.println("Second");
        System.out.println(a+b+c+d);
    }

    public static void add(byte a, byte b) {
        System.out.println("Third");
        System.out.println(a+b);
    }

    public static void add(float a, float b, float c) {
        System.out.println("a+b+c");
        System.out.println("Last");
    }
}
