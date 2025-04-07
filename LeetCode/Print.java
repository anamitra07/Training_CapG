package LeetCode;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 21-03-2025
 Time: 09:32
 ******************************/
public class Print {
    public static void print_1d(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void print_2d(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
