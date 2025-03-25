package March_17th;

import java.util.Scanner;
/*****************************
 Created by: Anamitra Kanjilal
 Date: 17-03-2025
 Time: 12:29
 ******************************/
public class Nextint_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
 /*
    Here, as soon as x takes input given by user,
    the second nextInt() method skips the space
    and takes the next integer as input for y.
    Similarly, for z as well.
  */