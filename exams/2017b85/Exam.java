public class Exam {

	public static void main(String[] args) {
		System.out.println("===== One Five Seven ======");
		System.out.println("Should be 2: " + oneFiveSeven(10));
		System.out.println("Should be 1: " + oneFiveSeven(5));
		System.out.println("Should be 2: " + oneFiveSeven(6));

		System.out.println("===== Print Closest ======");
		int[] a = { 0, 4, 6, 11, 11 };
		int[] b = { 10, 20, 30, 40 };

		System.out.println("Should be 0 and 10: ");
		printClosest(a, b, 11);
		System.out.println("Should be 4 and 10: " );
		printClosest(a, b, 13);
		System.out.println("Should be 0 and 20 Or 6 and 10: ");
		printClosest(a, b, 18);
		System.out.println("Should be 11 and 40: ");
		printClosest(a, b, 70);
	}
	
	// One Five Seven
	public static int oneFiveSeven(int n) {
		if (n < 5) {
			return n;
		}

		return oneFiveSeven(n, 0);
	}

	private static int oneFiveSeven(int n, int min) {
		if (n < 5) {
			return min + n;
		}

		if (n == 5) {
			return min + 1;
		}

		if (n == 6) {
			return min + 2;
		}

		if (n == 7) {
			return min + 1;
		}

		return min(oneFiveSeven(n - 1, min + 1), oneFiveSeven(n - 5, min + 1), oneFiveSeven(n - 7, min + 1));
	}

	private static int min(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		}

		if (b < a && b < c) {
			return b;
		}

		return c;
	}

	// Print closest
	public static void printClosest(int[] a, int[] b, int x) {
		int diff    = Integer.MAX_VALUE;

		int leftA   = 0;
		int rightB  = b.length - 1;

		int resultA = 0;
		int resultB = 0;

		while (leftA < a.length && rightB >= 0) {

			if (Math.abs(a[leftA] + b[rightB] - x) 	< diff) {
				resultA = leftA;
				resultB = rightB;
				diff = Math.abs(a[leftA] + b[rightB] - x);
			} 
			
			if (Math.abs(a[leftA] + b[rightB]) > x) {
				rightB--;
			} else {
				leftA++;
			}
		}
		
		System.out.println(a[resultA] + " and " + b[resultB]);
	}
}