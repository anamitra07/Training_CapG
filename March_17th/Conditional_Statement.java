package March_17th;
import java.util.Scanner;
/*****************************
 Created by: Anamitra Kanjilal
 Date: 17-03-2025
 Time: 14:37
 ******************************/

public class Conditional_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if(sc.hasNextInt()){
            System.out.println(sc.nextInt());
        }
        else if(sc.hasNextDouble()){
            System.out.println(sc.nextDouble());
        }
        else if(sc.hasNext()){
            System.out.println(sc.next());
        }
        else {
            System.out.println("Invalid Input!!");
        }
    }
}
