public class compare {

	public static void main(String[] args) {
		if (myCompare("mother", "hello") == 1) {
			System.out.println("SUCCESS");
		}	
	}
 
	public static int myCompare(String s1, String s2) {
		if (s1.length() == 1 && s2.length() == 1 && s1.charAt(0) == s2.charAt(0)) {
			return 0;
		} 
		if (s1.charAt(0) > s2.charAt(0)) {
			return 1;
		} else if (s1.charAt(0) < s2.charAt(0)) {
			return -1;
		}	

		if (s1.charAt(0) == s2.charAt(0)) {
			return myCompare(s1.substring(0), s2.substring(0)); 
		}

		return 0;
	}
}
