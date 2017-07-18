public class Exam {

    public static void main(String[] args) {
        int[] a = {2,5,10,20,50};
        int k = 40;
        int num = 4;
        System.out.println(makeSum(a, k, num));
    }

    public static int makeSum(int lengthes[], int k, int num) {
        return makeSum(lengthes, k, num, 0);
    }

    private static int makeSum(int[] arr, int stick, int max, int index) {
        if (index == arr.length || max == 0) {
            return 0;
        }

        if (stick - arr[index] == 0) {
            return 1 + makeSum(arr, stick, max, index + 1);
        } if (stick - arr[index] > 0) {
            return makeSum(arr, stick - arr[index + 1], max - 1, index) + makeSum(arr, stick, max, index + 1);
        }

        return makeSum(arr, stick, max, index + 1);

    }
}