public class Tester14{
	
	public static void main(String[] args) {
		System.out.println("******Q1:*******");
        int[][] mat0 = {
                {0,1,0,0,0,1},
                {1,0,0,1,1,1},
                {0,0,0,0,0,1},
                {1,1,1,1,1,1},
                {0,1,0,1,0,1},
                {1,0,0,0,1,0}};
        int[][] mat1 = { //sink=1
                {0, 1},
                {0, 0}};
       
        int[][] mat2 = {
                {0, 1, 1},
                {0, 1, 1},
                {0, 0, 0}};
        int[][] mat3 = {
                {0,1,0,1,1,0},
                {1,0,1,1,0,0},
                {0,0,0,1,0,1},
                {0,0,0,0,0,0},
                {1,0,1,1,0,0},
                {0,1,0,1,1,1}};
        int[][] mat4 = {
                {0,1,0,1,1,0},
                {1,0,1,1,0,0},
                {0,0,0,1,0,1},
                {0,0,0,0,0,1},
                {1,0,1,1,0,0},
                {0,1,0,1,1,1}};
        int[][] mat5 = {
                {0,1,0,1,1,0},
                {1,0,1,1,0,0},
                {0,0,0,1,0,1},
                {1,0,0,0,0,0},
                {1,0,1,1,0,0},
                {0,1,0,1,1,1}};
        int[][] mat6 = {
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1}};
        int[][] mat7 = {
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,0}};
        int[][] mat8 = {
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,0,1},
                {0,0,0,0,1,0},
                {0,0,0,0,0,0}};
        int[][] mat9 = {
                {0,0,1,0,0,0},
                {0,0,0,1,0,0},
                {0,0,1,0,0,0},
                {0,0,0,1,0,0},
                {0,0,1,0,0,0},
                {0,0,0,0,0,0}};
        int[][] mat10 = {
                {0,0,1,1,0,0},
                {0,0,1,1,0,0},
                {0,0,1,1,0,0},
                {0,0,0,0,0,0},
                {0,0,1,1,0,0},
                {0,0,0,1,0,0}};
        int[][] mat11 = {
                {0,0,1,1,0,0},
                {0,0,1,1,0,0},
                {0,0,1,1,0,0},
                {1,0,0,0,0,0},
                {0,0,1,1,0,0},
                {0,0,0,1,0,0}};
        int[][] mat12 = {
                {0,0,1,1,0,1},
                {0,0,1,1,0,1},
                {0,0,1,1,0,1},
                {1,0,0,0,1,1},
                {0,0,1,1,0,1},
                {0,0,0,0,0,0}};  
        int[][] mat13 = {
                {1,0,1,1,0,1},
                {0,0,0,1,0,1},
                {0,0,1,1,0,1},
                {1,0,0,0,0,0},
                {0,0,1,1,0,1},
                {0,0,0,0,0,0}};
        int[][] mat14 = {
                {0,0,1,1,1,1},
                {0,0,1,1,1,1},
                {0,0,1,1,1,1},
                {1,0,0,0,1,1},
                {0,0,0,0,0,0},
                {0,0,0,0,1,0}};  
        int[][] mat15 = {
                {1,1,1,1,1,1},
                {0,0,1,1,1,1},
                {0,0,1,1,1,1},
                {1,0,0,1,1,0},
                {0,0,0,0,0,0},
                {0,0,0,0,1,0}};        
               

        System.out.println("\n\n******Q4:*******\n");
        checknumPaths();

    }
	

    private static void checknumPaths() {
        int [][] mat5 = {
                 {1 , 2, 3, 6},
                 {2, 0, 14, 10},
                 {13, 22, 4, 2},
                 {15, 3, 2, 9}};

         int x1 = 1;
         int y1 = 1; 
         int x2 = 2; 
         int y2 = 4;
         
         if (0 != Ex14Student.numPaths(mat5, x1, y1, x2, y2))
             System.out.println("Check 1: Failed " + "\n" + "Correct result: 0 " + "/n" + "Your result: " + Ex14Student.numPaths(mat5, x1, y1, x2, y2)+"\n");
         if (0 == Ex14Student.numPaths(mat5, x1, y1, x2, y2))
             System.out.println("Check 1: Success.");

         y1 = 0;

         if (0 != Ex14Student.numPaths(mat5, x1, y1, x2, y2))
             System.out.println("Check 2: Failed "  + "\n" + "Correct result: 0 " +"\n" + "Your result: " + Ex14Student.numPaths(mat5, x1, y1, x2, y2)+"\n");
         if (0 == Ex14Student.numPaths(mat5, x1, y1, x2, y2))
         System.out.println("Check 2: Success.");

        int [][] mat6 = {
                 {1 , 2, 3},
                 {2, 0, 14},
                 {13, 22, 4}};
         
         x1 = 0;
         y1 = 1;
         x2 = 1;
         y2 = 2;

         if (2 != Ex14Student.numPaths(mat6, x1, y1, x2, y2))
             System.out.println("Check 3: Failed " + "\n" + "Correct result: 2 " +"\n" + "Your result: " + Ex14Student.numPaths(mat6, x1, y1, x2, y2) +"\n");
         if (2 == Ex14Student.numPaths(mat6, x1, y1, x2, y2))
             System.out.println("Check 3: Success.");
         
         x2 = 2;
         
         if (0 != Ex14Student.numPaths(mat6, x1, y1, x2, y2))
             System.out.println("Check 4: Failed " + "\n" + "Correct result: 0 " +"\n" + "Your result:" + Ex14Student.numPaths(mat6, x1, y1, x2, y2)+"\n");
         if (0 == Ex14Student.numPaths(mat6, x1, y1, x2, y2))
             System.out.println("Check 4: Success.");
         
         int[][] m1 = new int[5][5];
         for(int i = 0; i < 5; i++)
             for (int j = 0; j < 5; j++)
                 m1[i][j] = 1;
         System.out.println("\nTest 1: " + Ex14Student.numPaths(m1, 0, 1, 2, 4) + "\n");
         System.out.println("Test 2: " + Ex14Student.numPaths(m1, 1, 2, 1, 3) + "\n");
         System.out.println("Test 3: " + Ex14Student.numPaths(m1, 0, 0, 3, 3) + "\n");

         int[][] m2 = new int[7][7];
         for(int i = 0; i < 7; i++)
             for (int j = 0; j < 7; j++)
                 m2[i][j] = 1;
         System.out.println("Test 4: " + Ex14Student.numPaths(m2, 0, 0, 3, 4) + "\n");
         System.out.println("Test 5: " + Ex14Student.numPaths(m2, 2, 2, 0, 0) + "\n"); 

     }
}