package LeetCode;

public class Problem_852 {
    public static int peakIndexInMountainArray(int[] arr) {

        int left = 0,right = arr.length-1;

        while(left<right) {
            int mid = (left+right)/2;
            if(arr[mid]<arr[mid+1])
                left = mid +1;
            else
                right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        int size = Input_1d.input_size();
        int[] arr = Input_1d.input_integer(size);
        System.out.println(peakIndexInMountainArray(arr));
    }
}
