package LeetCode;

import java.util.Scanner;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 13-03-2025
 Time: 12:37
 ******************************/

public class Input {
    public static int[] input_1d() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter values: ");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();                      // taking inputs for array
        return arr;
    }

    public static int[][] input_2d() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
}
