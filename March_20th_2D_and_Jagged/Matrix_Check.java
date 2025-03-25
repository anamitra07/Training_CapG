package March_20th_2D_and_Jagged;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 20-03-2025
 Time: 12:12
 ******************************/
public class Matrix_Check {
    public static void main(String[] args) {
        //transpose();
        transpose();
    }

    public static void symmetric() {
        int[][] arr = TwoD_Array.input_2d();
        int match = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == arr[j][i])
                    match++;
            }
        }
        if(match!=arr.length)
            System.out.println("Symmetric");
        else
            System.out.println("Not Symmetric");
    }

    public static void transpose(){
        int[][] arr = TwoD_Array.input_2d();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
            }
        }
        TwoD_Array.print_for(arr);
    }
}
