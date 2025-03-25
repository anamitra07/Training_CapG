package LeetCode;

import java.util.Scanner;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 13-03-2025
 Time: 12:37
 ******************************/

public class Input_1d {
    public static void main(String[] args) {
        System.out.println("Invalid!!");
    }
    public static int input_size() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        return size;
    }
    public static int[] input_integer(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter values: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();                      // taking inputs for array
        return arr;
    }

    public static double[] input_decimal(int n) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[n];
        System.out.println("Enter values: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextDouble();                      // taking inputs for array
        return arr;
    }
}
