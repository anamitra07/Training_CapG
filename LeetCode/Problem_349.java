package LeetCode;

import java.util.HashSet;
import java.util.Arrays;

public class Problem_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr1 = new HashSet<Integer>();
        HashSet<Integer> arr2 = new HashSet<Integer>();

        for(int i=0;i<nums1.length;i++) {
            arr1.add(nums1[i]);
        }

        for(int i: nums2) {
            if(arr1.contains(i))
                arr2.add(i);
        }

        arr1.clear();

        for(int i: arr2) {
            if(!arr1.contains(i))
                arr1.add(i);
        }

        int[] array = new int[arr1.size()];
        int k=0;
        for(int num: arr1) {
            array[k++] = num;
        }

        return array;
    }

    public static void main(String[] args) {
        int n1 = Input.input_size();
        int[] nums1 = Input.input_integer(n1);

        int n2 = Input.input_size();
        int[] nums2 = Input.input_integer(n2);

        int[] arr = intersection(nums1,nums2);
        System.out.println(Arrays.toString(arr));
    }
}
