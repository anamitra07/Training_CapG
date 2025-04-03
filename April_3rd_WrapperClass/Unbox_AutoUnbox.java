package April_3rd_WrapperClass;

public class Unbox_AutoUnbox {
    public static void main(String[] args) {
        Integer y = 30;
        int a = y.intValue();  // unboxing

        Boolean flag = true;
        boolean b = flag.booleanValue(); // unboxing

        System.out.println("a: "+a+" b: "+b);

        Character ch = 'a'; // auto-boxing
        char c = ch; // auto-unboxing
    }
}
