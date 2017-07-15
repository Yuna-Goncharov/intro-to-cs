public class Exam {
    
    public static void main(String[] args) {
        String s1 = "geek";
        String s2 = "gesek";

        String s3 = "sunday";
        String s4 = "saturday";

        String s5 = "one";
        String s6 = "ona";

        System.out.println(edit(s1, s2));
        System.out.println(edit(s3, s4));
        System.out.println(edit(s5, s6));
    }

    public static int edit(String s1, String s2) {
        return convert(s1, s2);
    }


    // Recursion way to count the number of operation required to convert string FROM to string TO.
    //
    // We can only use 2 methods - add a char or remove a char.
    //
    // If the chars at 0 at both strings are equal - we call the function
    // with substring from this char.
    //
    // Else, we add a number to our count, and call the function with the next substrings.
    private static int convert(String from, String to) {
        if (from.length() == 1 || to.length() == 1) {
            if (from.charAt(0) != to.charAt(0)) {
                return 1;
            } 

            return 0;
        }

        if (from.charAt(0) == to.charAt(0)) {
            return convert(from.substring(1), to.substring(1));
        } else {
            return 1 + convert(from.substring(1), to.substring(1));
        }
    }

    private static String add(String to, char c) {
        return c + to;
    }
}