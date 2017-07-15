public class Exam {
    public static void main(String[] args) {
        int[] arr1 = {4, 5};
        int[] arr2 = {4, 9, 3};
        int[] arr3 = {-5, -5, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 67, 67, 99};

        System.out.println("== IS SUM OF ==");
        System.out.println(isSumOf(arr1, 13));
        System.out.println(isSumOf(arr2, 4));

        System.out.println("== COUNT ==");
        System.out.println(count(arr3, 13));
        System.out.println(count(arr3, 4));
        System.out.println(count(arr3, 2));
        System.out.println(count(arr3, -5));
        System.out.println(count(arr3, 67));
        System.out.println(count(arr3, 99));
        System.out.println(count(arr3, 900));
    }

    // Recursive function to find if the sum of group of numbers 
    // from s can equal n.
    // If group of s will be equal n, the function return true, 
    // otherwise false. the function also print the group.
    public static boolean isSumOf(int[] s, int n) {
        return isSumOf(s, n, 0, "");
    }

    // Helper function - if n is 0, which mean we success with finding
    // a group, we return true and print the string.
    //
    // If n is lower than 0, or the index is equal or less than the length
    // of the array, we return false.
    //
    // Than, the meat of the function is - we call to the function with 
    // the array, the number minus the current number in the array,
    // the index, and the str plus the number of the index.
    // If this will return false, we will check with the next number.
    private static boolean isSumOf(int[] s, int n, int index, String str) {
        if (n == 0) {
            System.out.println(str);
            return true;
        }

        if (n < 0 || index >= s.length) {
            return false;
        }


        return isSumOf(s, n - s[index], index, str + s[index] + "") || isSumOf(s, n, index + 1, str);
    }


    // Time: O(log n * log n)
    // Space O(n)
    // Apply a binary search to find the index of the most left X, and than for the right.
    // than the function compute the diff between them - so the diff is the count 
    // of the indexe's where X is found.
    public static int count(int[] a, int x) {
        return binaryLeft(a, x) > -1 ? (binaryRight(a, x) - binaryLeft(a, x)) + 1 : 0;
    }

    // Find the most left index of X using binary search
    private static int binaryLeft(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == x) {
                if (mid == 0 || a[mid - 1] != x) {
                    return mid;
                } 

                high = mid - 1;
            } else if (a[mid] > x) {
                high = mid - 1;
            } else if (a[mid] < x) {
                low = mid + 1;  
            }
        }

        return -1;
    }

    // Find the most right index of X using binary search
    private static int binaryRight(int[] a, int x) {
        int low = 0;
        int high = a.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == x) {
                if (mid == a.length - 1 || a[mid + 1] != x) {
                    return mid;
                }

                low = mid + 1;
            } else if (a[mid] > x) {
                high = mid - 1;
            } else if (a[mid] < x) {
                low = mid + 1;
            }
        }
        
        return -1;
    }

}
