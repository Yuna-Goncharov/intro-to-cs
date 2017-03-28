
/**
 * Class Line will calc the length of line in plane between two given points.
 *  
 * @author Eyal Cohen
 * @version 0.0.1
 */

import java.util.Scanner;
public class Line {
    
    /**
     * @description This function should do the following:
     * 1. Get two points on plane from user
     * 2. Calculate the length of the line between the points
     * 3. Display the length
     * 
     * This function assume the input is valid and all given input is integers.
     */
    public static void main(String [] args) {
        // initialize scanner
        Scanner scan = new Scanner(System.in);
        
        // declare variables
        int x1, x2, y1, y2;
        double length;
        
        // getting input from user using Scanner scan;
        System.out.println("Hey! We're going to calculate the length of line between the two given point you are going to give me! \n so please, enter 4 integers.");
        System.out.println("Enter x1: ");
        x1 = scan.nextInt();
        System.out.println("Enter y1: ");
        y1 = scan.nextInt();
        System.out.println("Enter x2: ");
        x2 = scan.nextInt();
        System.out.println("Enter y2: ");
        y2 = scan.nextInt();
       
        // calc length using root formula
        length = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
        
        System.out.println("The length of the line between the points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + length);
    }
    
}
