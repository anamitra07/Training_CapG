package March_26th_Constructor_Chaining;

public class SubClass extends SuperClass{
    double a = 23.56;
    static double b = 30.56;

    public void print() {
        System.out.println(super.a);
        System.out.println(a);

        System.out.println(SuperClass.b);
        System.out.println(b);

    }
}
