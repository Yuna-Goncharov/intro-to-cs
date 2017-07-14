public class Exam {
    public static void main(String[] args) {
        int[] arr1 = {4, 5};
        int[] arr2 = {4, 9, 3};

        System.out.println(isSumOf(arr1, 13));
        System.out.println(isSumOf(arr2, 4));
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
}
