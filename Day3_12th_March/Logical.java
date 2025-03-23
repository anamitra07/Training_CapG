package Day3_12th_March;
import java.util.*;
/*****************************
 Created by: Anamitra Kanjilal
 Date: 12-03-2025
 Time: 10:20
 ******************************/

public class Logical
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        // Using Nested if:
//        if(num>0) {
//            if (num % 2 == 0)
//                System.out.println("Positive even");
//            else if (num % 2 != 0)
//                System.out.println("Positive odd");
//        }

        // Using if else if ladder:
        if(num>0 && num%2==0)
            System.out.println("Positive even");
        else if(num>0 && num%2!=0)
            System.out.println("Positive odd");
        else if(num<0 && num%2==0)
            System.out.println("Negative even");
        else if(num<0 && num%2!=0)
            System.out.println("Negative odd");
    }
}
