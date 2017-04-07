
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
        
        double x1, y1, x2, y2, x3, y3, rib1, rib2, rib3; // triangle 1
        double x4, y4, x5, y5, x6, y6, rib4, rib5, rib6; // trinalge 2
        boolean isCongruent, isRib1Equal, isRib2Equal, isRib3Equal;
        
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
        System.out.println("That's was long! good job.. wait for result.");
        
        // Calc length of triangle 1 ribs
        rib1 = (double) Math.sqrt(Math.pow((x1-x2), 2.0) + Math.pow((y1-y2), 2.0));
        rib2 = (double) Math.sqrt(Math.pow((x1-x3), 2.0) + Math.pow((y1-y3), 2.0));
        rib3 = (double) Math.sqrt(Math.pow((x2-x3), 2.0) + Math.pow((y2-y3), 2.0));

        // Calc length of triangle 2 ribs
        rib4 = (double) Math.sqrt(Math.pow((x4-x5), 2) + Math.pow((y4-y5), 2));
        rib5 = (double) Math.sqrt(Math.pow((x4-x6), 2) + Math.pow((y4-y6), 2));
        rib6 = (double) Math.sqrt(Math.pow((x5-x6), 2) + Math.pow((y5-y6), 2));
        
        System.out.println("The first triangle is: (" + x1 +", " + y1 + "), (" + x2 + ", " + y2 + ") (" + x3 + ", " + y3 + ")");
        System.out.println("Its lengthes are : " + rib1 + " " + rib2 + " " + rib3);
        System.out.println("The first triangle is: (" + x4 +", " + y4 + "), (" + x5 + ", " + y5 + ") (" + x6 + ", " + y6 + ")");
        System.out.println("Its lengthes are : " + rib4 + " " + rib5 + " " + rib6);        
        
        isRib1Equal = ((rib1 == rib4) || (rib1 == rib5) || (rib1 == rib6));
        isRib2Equal= ((rib2 == rib4) || (rib2 == rib5) || (rib2 == rib6));
        isRib3Equal = ((rib3 == rib4) || (rib3 == rib5) || (rib3 == rib6));
        
        if (isRib1Equal && isRib2Equal && isRib3Equal)  {
            isCongruent = true;
            System.out.println("The 2 trinagles you enter are congruent!");
        } else {
            System.out.println("The 2 trinagles you enter are not congruent!");
        }
    }
}
