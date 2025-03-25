package LeetCode;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 21-03-2025
 Time: 09:31
 ******************************/
public class Turn_Image {
    public static void main(String[] args) {
        int[][] arr = TwoD.input();
        solution(arr);
    }

    public static void solution(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }
}
