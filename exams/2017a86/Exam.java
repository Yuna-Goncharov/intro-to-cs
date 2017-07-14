public class Exam {
    
    public static void main(String[] args) {
        String s1 = "geek";
        String s2 = "gesek";

        String s3 = "sunday";
        String s4 = "saturday";

        System.out.println(edit(s1, s2));
        System.out.println(edit(s3, s4));
    }

    public static int edit(String s1, String s2) {
        return convert(s1, s2);
    }


    // Recursion way to convert string FROM to string TO.
    //
    // We can only use 2 methods - add a char or remove a char.
    //
    // If the chars at 0 at both strings are equal - we call the function
    // with the substring from this char.
    //
    // Else, we add the char from the string TO in the strign FROM,
    // and call the function with the next substrings.
    private static int convert(String from, String to) {
        if (from.length() == 0 || to.length() == 0) {
            return 0;
        }

        if (from.charAt(0) == to.charAt(0)) {
            return convert(from.substring(1), to.substring(1));
        } else {
            from = add(from, to.charAt(0));
            from = from.substring(2);
            to = to.substring(1);
            return 1 + convert(from, to);
        }
    }

    private static String add(String to, char c) {
        return c + to;
    }
}