package Day8_20th_March;
import java.util.Scanner;
/*****************************
 Created by: Anamitra Kanjilal
 Date: 20-03-2025
 Time: 15:03
 ******************************/
public class Jagged_Array {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] jaggedArray = input_jagged();
        TwoD_Array.print_for(jaggedArray);
    }

    public static int[][] input_jagged(){
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        int[][] jaggedArray = new int[row][];
        for(int i=0;i<row;i++) {
            System.out.println("Enter number of columns for "+ (i+1) + "th row: ");
            int col = sc.nextInt();

            jaggedArray[i] = new int[col];

            for (int j = 0; j < col; j++) {
                System.out.println("Enter element for " + (i+1) + "th row and " + (j+1) + "th column: ");
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        return jaggedArray;
    }


}
