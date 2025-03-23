package Day5_17th_March;

import java.util.Scanner;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 17-03-2025
 Time: 11:09
 ******************************/

public class Scanner_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer number: ");
        int num1 = sc.nextInt();
        System.out.println(num1);

        System.out.println("Enter first boolean: ");
        boolean bool1 = sc.nextBoolean();
        System.out.println(bool1);

        System.out.println("Enter first byte number: ");
        byte num2 = sc.nextByte();
        System.out.println(num2);

        // Similarly short, long, float, double and string can also be input.
    }
}
