package April_2nd_Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiTry_MultiCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled");
        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException handled");
        }

        try {
            sc.nextLine();
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("\nEnter the index to access: ");
            System.out.println(arr[sc.nextInt()]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }

        try {
            Class.forName("Demo");
        }
        // General catch block for line 16
        catch(Exception e) {
            System.out.println("ClassNotFoundException handled");
        }
    }
}
