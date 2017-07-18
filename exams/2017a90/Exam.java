public class Exam {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 10, 11, 15 };

        System.out.print("Should be 4: " + findSmallest(arr));
    }

    public static int findSmallest(int[] arr) {
        if (arr[0] > 1) {
            return 1;
        }

        int smallest = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 < arr[i + 1] && smallest < arr[i - 1]) {
                return smallest + 1;
            }

            smallest =+ arr[i + 1];
        }

        return smallest + 1;
    }

}