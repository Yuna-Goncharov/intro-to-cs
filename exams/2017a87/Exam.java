public class Exam {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        int[] arr1 = {4, 5, 6, 10, 12};

        System.out.println(isPythagorean(arr));
        System.out.println(isPythagorean(arr1));
    }

    // 1. We power each number with himself
    // 2. We loop through the array with binary seach in order to find if there is 
    // Pythagorean triple.
    public static boolean isPythagorean(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        for (int j = arr.length - 1; j >= 2; j--) {
            int low = 0;
            int high = j - 1;

            while (low < high) { 
                if (arr[low] + arr[high] == arr[j]) {
                    return true;
                } else if (arr[low] + arr[high] > arr[j]) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return false;
    }
}