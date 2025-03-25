package March_13th;
import java.util.Scanner;
/*****************************
Created by: Anamitra Kanjilal
Date: 13-03-2025
Time: 14:48
******************************/

public class Method_Test_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();

        search(arr,target);
    }
    public static void search(int[] arr, int key){
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
                flag=1;
        }
        if(flag==1)
            System.out.println("Key found");
        else
            System.out.println("Key not found");
    }
}
