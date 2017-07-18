public class Exam {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1 };

        System.out.println("Should be 5: " + passingCars(arr));
    }

    public static int passingCars(int[] arr) {
        int passing = 0;
        int zeros   = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] == 0) {
                zeros++;
            } else {
                passing += zeros;
            }
        }

        return passing;
    }    
}