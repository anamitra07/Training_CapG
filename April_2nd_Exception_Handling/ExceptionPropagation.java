package April_2nd_Exception_Handling;

public class ExceptionPropagation {
    public static void main(String[] args) {
        alpha();
    }

    public static void alpha() {
        System.out.println("Alpha");
        beta();
    }

    public static void beta() {
        System.out.println("Beta");
        gamma();
    }

    public static void gamma() {
        System.out.println("Gamma");
        try {
            System.out.println(10/0);
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception handled");
        }
        System.out.println("End of gamma");
    }
}
