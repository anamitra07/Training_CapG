package April_2nd_Exception_Handling;
import java.util.Scanner;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter two numbers: ");
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
            sc.close();
        }
        catch(Exception e) {
            System.out.println("Exception not handled");
        }
        finally {
            sc.close();
            System.out.println("Finally Block");
        }

        try(Scanner scan = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        }
    }
}
