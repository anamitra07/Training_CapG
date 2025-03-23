package Day8_20th_March;
import java.util.Scanner;
/*****************************
 Created by: Anamitra Kanjilal
 Date: 20-03-2025
 Time: 11:29
 ******************************/
public class Max_in_2DArray {
    public static void main(String[] args) {
        int[][] arr = TwoD_Array.input_2d();
        findMax(arr);
    }

    public static void findMax(int[][] a) {
        int max = a[0][0];
        for(int i=0; i<a.length ; i++){
            for(int j=0 ; j<a[i].length ; j++){
                if(a[i][j] > max)
                    max = a[i][j];
            }
        }
        System.out.println("\n Max element is: "+ max);
    }
}
