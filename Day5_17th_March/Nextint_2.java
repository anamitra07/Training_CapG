package Day5_17th_March;
import java.util.Scanner;
/*****************************
 Created by: Anamitra Kanjilal
 Date: 17-03-2025
 Time: 14:04
 ******************************/
public class Nextint_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("42 20 50");
        //System.out.println("Enter a number: ");
        if(sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }
        else {
            System.out.println("Input mismatch");
        }
    }
}

/* hasNextInt() function checks if the given input can be
   converted to Int() or not.*/