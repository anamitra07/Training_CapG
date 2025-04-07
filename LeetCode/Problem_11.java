package LeetCode;
import java.lang.Math;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 12-03-2025
 Time: 16:05
 ******************************/

public class Problem_11 {
    public static void main(String[] args) {
        int size = Input.input_size();
        int arr[] = Input.input_integer(size);
        maxArea(arr);
    }

    public static void maxArea(int[] height) {
        int len = height.length;
        int max_area=0;
        for(int i=0;i<len-1;i++) {
            for(int j=1;j<len;j++) {
                int w = j-i;
                int h = Math.min(height[i],height[j]);
                int area = w*h;
                if(area>max_area)
                    max_area = area;
            }
        }
        System.out.println(max_area);
    }
}
