private static void checkIsSink() {
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
                
        if( Ex14.isSink(mat0) != -1 ||
        Ex14.isSink(mat1) != 1 || Ex14.isSink(mat2) != 2  || Ex14.isSink(mat3) != 3 || Ex14.isSink(mat4) != -1 || Ex14.isSink(mat5) != -1 
        || Ex14.isSink(mat6) != -1 || Ex14.isSink(mat7) != 5 
        || Ex14.isSink(mat8) != -1 || Ex14.isSink(mat9) != -1 
        || Ex14.isSink(mat10) != 3|| Ex14.isSink(mat11) != -1 || Ex14.isSink(mat12) != 5|| Ex14.isSink(mat13) != -1|| Ex14.isSink(mat14) != 4|| Ex14.isSink(mat14) != 4)
            System.out.println("isSink() is failed");
        else
            System.out.println("isSink() is Success");

        System.out.println("");
        System.out.println("Mat Results:");
        System.out.println("");
        System.out.println("Mat 0: " + Ex14.isSink(mat0));
        System.out.println("Mat 1: " + Ex14.isSink(mat1));
        System.out.println("Mat 2: " + Ex14.isSink(mat2));
        System.out.println("Mat 3: " + Ex14.isSink(mat3));
        System.out.println("Mat 4: " + Ex14.isSink(mat4));
        System.out.println("Mat 5: " + Ex14.isSink(mat5));
        System.out.println("Mat 6: " + Ex14.isSink(mat6));
        System.out.println("Mat 7: " + Ex14.isSink(mat7));
        System.out.println("Mat 8: " + Ex14.isSink(mat8));
        System.out.println("Mat 9: " + Ex14.isSink(mat9));
        System.out.println("Mat 10: " + Ex14.isSink(mat10));
        System.out.println("Mat 11: " + Ex14.isSink(mat11));
        System.out.println("Mat 12: " + Ex14.isSink(mat12));
        System.out.println("Mat 13: " + Ex14.isSink(mat13));
        System.out.println("Mat 14: " + Ex14.isSink(mat14));
        System.out.println("Mat 15: " + Ex14.isSink(mat15));
       
    }