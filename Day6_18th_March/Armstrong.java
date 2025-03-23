package Day6_18th_March;
import java.util.Scanner;
/*****************************
 Created by: Anamitra Kanjilal
 Date: 18-03-2025
 Time: 10:12
 ******************************/
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        armstrong(num);
    }

    public static void armstrong(int n)
    {
        int copy = n, count = count_digits(n);
        double sum=0;
        while(n!=0)
        {
            int rem = n%10;
            sum = sum + Math.pow(rem,count);
            n /= 10;
        }
        if(sum==copy)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }

    public static int count_digits(int n) {
        int count=0;
        while(n!=0)
        {
            count++;
            n /= 10;
        }
        return count;
    }
}
