package LeetCode;

import java.util.Scanner;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 21-03-2025
 Time: 09:32
 ******************************/
public class TwoD {
    public static int[][] input() {
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

    public static void print_for(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
