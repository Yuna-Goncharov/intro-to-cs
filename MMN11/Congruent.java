
/**
 * Class Congruent will detrminate if two given triangles are congruent
 *
 * @author Eyal Cohen
 * @version 0.0.1
 */

import java.util.Scanner;
public class Congruent {
    
    /**
     * @description This function should do the following: 
     * 1. Get 6 points of triangles from user
     * 2. Calculate the length of each point
     * 3. Check if the 2 traingles are congruent.
     * 4. Display the length of each point 
     * 5. Display if the triangles are congruent
     *  
     * This function assume the input is valid and all given input is integers.
     */
    public static void main(String[] args) {
        // initialize scanner
        Scanner scan = new Scanner(System.in);
        
        // declare variables
        int x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6;
        int length1, length2, length3, length4, lnegth5, length6;
        
        System.out.println("Hey! We're going to check if the 2 triangles you will give me are cungruent, \n so please enter 3 points for the frist triangle, and then 3 points for the second one");
        System.out.println("Point 1 - x (please enter 1 integer number");
        x1 = scan.nextInt();
        System.out.println("Point 1 - y (please enter 1 integer number");
        y1 = scan.nextInt();
        System.out.println("Point 2 - x (please enter 1 integer number");
        x2 = scan.nextInt();
        System.out.println("Point 2 - y (please enter 1 integer number");
        y2 = scan.nextInt();
        System.out.println("Point 3 - x (please enter 1 integer number");
        x3 = scan.nextInt();
        System.out.println("Point 3 - y (please enter 1 integer number");
        y3 = scan.nextInt();
        System.out.println("Point 4 - x (please enter 1 integer number");
        x4 = scan.nextInt();
        System.out.println("Point 4 - y (please enter 1 integer number");
        y4 = scan.nextInt();
        System.out.println("Point 5 - x (please enter 1 integer number");
        x5 = scan.nextInt();
        System.out.println("Point 5 - y (please enter 1 integer number");
        y5 = scan.nextInt();
        System.out.println("Point 6 - x (please enter 1 integer number");
        x6 = scan.nextInt();
        System.out.println("Point 6 - y (please enter 1 integer number");
        y6 = scan.nextInt();
        System.out.println("That's was long! good job");
        
    }
}
