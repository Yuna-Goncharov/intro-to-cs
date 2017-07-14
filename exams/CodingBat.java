public class CodingBat {
    public static void main(String[] args) {
        count7Check();
    }

    public static void count7Check(int n) {
        System.out.println(count7(717));
    }

    public static int count7(int n) {
        int current = n % 10;
        
        if (current == 7) {
            return 1;
        }

        System.out.println(n);        
        return count(n / 10);
    }
}