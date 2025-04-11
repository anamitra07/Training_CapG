package April_11th_Sorting;

public class MergeSort {
        // Merges two subarrays of arr[].
        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]
        public static void conquer(int arr[], int start, int mid, int end)
        {
            // Find sizes of two subarrays to be merged
            int n1 = mid - start + 1;
            int n2 = end - mid;

            // Create temp arrays
            int[] LeftArray = new int[n1];
            int[] RightArray = new int[n2];

            // Copy data to temp arrays
            for (int i = 0; i < n1; ++i)
                LeftArray[i] = arr[start + i];
            for (int j = 0; j < n2; ++j)
                RightArray[j] = arr[mid + 1 + j];

            // Merge the temp arrays

            // Initial indices of first and second subarrays
            int i = 0, j = 0;

            // Initial index of merged subarray array
            int k = start; // 0
            while (i < n1 && j < n2) {
                if (LeftArray[i] <= RightArray[j]) {
                    arr[k] = LeftArray[i];
                    i++;
                }
                else {
                    arr[k] = RightArray[j];
                    j++;
                }
                k++;
            }

            // Copy remaining elements of L[] if any
            while (i < n1) {
                arr[k] = LeftArray[i];
                i++;
                k++;
            }

            // Copy remaining elements of R[] if any
            while (j < n2) {
                arr[k] = RightArray[j];
                j++;
                k++;
            }
        }

        // Main function that sorts arr[l..r] using
        // merge()
        public static void divide(int arr[], int start, int end)
        {
            if(start >= end) {
                return;
            }
            // Find the middle point
            int mid = start + (end - start) / 2;

            // Sort first and second halves
            divide(arr, start, mid);
            divide(arr, mid + 1, end);

            // Merge the sorted halves
            conquer(arr, start, mid, end);
        }

        // A utility function to print array of size n
        public static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Driver code
        public static void main(String args[])
        {
            int arr[] = { 12, 11, 13, 5, 6, 7 };

            System.out.println("Given array is");
            printArray(arr);

            divide(arr, 0, arr.length - 1);

            System.out.println("\nSorted array is");
            printArray(arr);
        }
    }
