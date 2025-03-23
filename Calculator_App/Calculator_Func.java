package Calculator_App;
import java.util.Scanner;

/*******************************

Created By: Anamitra Kanjilal
Date: 18-03-2025
Time: 19:49

********************************/

public class Calculator_Func {
    static double num1, num2, num3;
    static int choice;
    public static Scanner sc = new Scanner(System.in);


    public static void addMenu() {
        boolean flag = true;
        do {
            System.out.println("\n***** Addition Menu ***** \n1. Perform addition? \n2. Exit");
            System.out.print("Enter your input: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nHow many numbers to add: ");
                    int n = sc.nextInt();
                    switch (n) {
                        case 2:
                            System.out.print("Enter two numbers: ");
                            num1 = sc.nextDouble();
                            num2 = sc.nextDouble();
                            System.out.println("Output: " + (num1 + num2));
                            break;
                        case 3:
                            System.out.print("Enter three numbers: ");
                            num1 = sc.nextDouble();
                            num2 = sc.nextDouble();
                            num3 = sc.nextDouble();
                            System.out.println("Output: " + (num1 + num2 + num3));
                            break;
                        default:
                            System.out.println("\n Invaiid Input!! \n");
                    }
                    break;
                case 2:
                    flag = false;
                    System.out.println("\n Hope you got the answer.\n");
                    break;
            }
        }while(flag);
    }

    public static void subMenu() {
        boolean flag = true;
        do {
            System.out.println("\n***** Subtraction Menu ***** \n1. Perform Subtraction? \n2. Exit");
            System.out.print("Enter your input: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nHow many numbers to perform operation on: ");
                    int n = sc.nextInt();
                    switch (n) {
                        case 2:
                            System.out.print("Enter two numbers: ");
                            num1 = sc.nextDouble();
                            num2 = sc.nextDouble();
                            System.out.println("Output: " + (num1 - num2));
                            break;
                        default:
                            System.out.println("\n Invaiid Input \n");
                    }
                    break;
                case 2:
                    flag = false;
                    System.out.println("\n Hope you got the answer.\n");
                    break;
            }
        }while(flag);
    }

    public static void mulMenu() {
        System.out.println("How many numbers to multiply: ");
        int n = sc.nextInt();
        switch (n) {
            case 2:
                System.out.println("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                System.out.println(num1 * num2);
                break;
            case 3:
                System.out.println("Enter three numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                num3 = sc.nextDouble();
                System.out.println(num1 * num2 * num3);
                break;
            default:
                System.out.println("Invaiid Input");
        }
    }

    public static void divMenu() {
        System.out.println("How many numbers to divide: ");
        int n = sc.nextInt();
        switch (n) {
            case 2:
                System.out.println("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                if(num2==0)
                    System.out.println("Invalid input!!");
                else
                    System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invaiid Input");
        }
    }
}
