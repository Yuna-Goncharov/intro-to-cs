import java.util.Arrays;
public class Binarysearch {
    

    public static void main(String[] args) {

        int arr[] = { 5, 1, 2, 19, 3, 22, 18, 90, 4 };
        int arr2[] = {1, 2, 5, 10, 25, 85, 89, 99 };

        // System.out.println("=== Quicksort ===");
        // System.out.println("Before: " + Arrays.toString(arr));
        // System.out.println("After: " + Arrays.toString(quickSort(arr)));
        
        System.out.println("Should be 4: " + binarySearch(arr2, 25));
        System.out.println("Should be 7: " + binarySearch(arr2, 99));
        System.out.println("Should be -1: " + binarySearch(arr2, 100));

    } 

    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return -1;
    }
}