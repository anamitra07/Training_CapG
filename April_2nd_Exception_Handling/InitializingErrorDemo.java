package April_2nd_Exception_Handling;

public class InitializingErrorDemo {
    static String s1 = null;
    static String s2 = s1.toLowerCase();

    public static void main(String[] args) {
        System.out.println(s1);
    }
}
