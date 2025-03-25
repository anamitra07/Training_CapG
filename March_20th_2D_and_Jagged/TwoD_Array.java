package March_20th_2D_and_Jagged;
import java.util.Arrays;
import java.util.Scanner;
/*****************************
 Created by: Anamitra Kanjilal
 Date: 20-03-2025
 Time: 10:09
 ******************************/

public class TwoD_Array {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = input_2d();
        print_for(arr);
        deeptostring(arr);
        print_forEach(arr);
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

    public static void print_for(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void deeptostring(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }

    public static void print_forEach(int[][] arr) {
        for(int[] a: arr){
            for(int e : a){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
