import java.util.Arrays;

public class Ex14 {
    
    /**
     * @description Find a sink in a matrix 
     * Sink exists if a row at X is full of 0, and all the columns at X are 1's, 
     * excpet the [X][X] value.
     * 
     * @param int [][] mat - matrix to find sink in
     * 
     * @return int - The sink index if exists, or -1.
     * 
     * Big O Time - O(N)
     * Big O Space - O(N)
     */ 
    public static int isSink(int [][] mat) {
        int sink = -1;
        int row = 0;
        int col = 0;

        while (row <= mat.length - 1 && col <= mat.length - 1) {
            if (mat[row][col] == 0) {
                col++;

                if (col == mat.length) {
                    sink = col - 1;
                }
            } else if (mat[row][col] == 1) {
                row++;
            }
        }

        if (sink >= 0) {
            for (int i = 0; i < mat.length; i++) {
                if (mat[sink][i] == 1) {
                    sink = row;
                }
            }
            
            return sink;
        }

        return -1;
    }
    
    /**
     * @description Check if a X is inside a sorted matrix.
     *
     * @param int [][] mat - the matrix to search inside
     * @param int x - the number to find
     *
     * @return boolean - true if exists, false if isn't.
     * 
     * Big O Time - O(N)
     * Big O Space - O(N)
     */ 
    public static boolean find(int [][] mat, int x) {
        int rowLow = 0;
        int colLow = 0;
        int rowHigh = mat.length;
        int colHigh = mat.length;

        boolean isFound = false;
        if (mat[rowLow][colLow] <= x && mat[rowHigh - 1][colHigh - 1] >= x) {

            while (!isFound && rowLow < rowHigh && colLow < colHigh ) {
                int rowMid = (rowLow + rowHigh) / 2;
                int colMid = (colLow + colHigh) / 2;

                // First cell forth quarter
                if (!(rowHigh - 1 == rowLow && colHigh - 1 == colLow)) { 
                    if (mat[rowMid][colMid] == x) {
                        return true; 
                    } 
                    
                    if (mat[rowMid][colMid] > x) {
                        if (mat[rowMid][colLow] == x) {
                            return true;
                        } 
                        
                        if (mat[rowMid][colLow] > x) {
                            if (mat[rowLow][colMid] == x) {
                                return true;
                            }
                            
                            if (mat[rowLow][colMid] > x) {
                                if (mat[rowLow][colLow] == x) {
                                    return true;
                                }
                                
                                if (mat[rowLow][colLow] < x) {
                                    rowHigh = rowMid + 1;
                                    colHigh = colMid;
                                }
                            } 
                            
                            if (mat[rowLow][colMid] < x) {
                                colLow  = colMid;
                                rowHigh = rowMid;
                            }
                        } 
                        
                        if (mat[rowMid][colLow] < x) {
                            colHigh = colMid;
                            rowLow  = rowMid;
                        } 
                    } 
                    
                    if (mat[rowMid][colMid] < x) {
                        colLow = colMid;
                        rowLow = rowMid;
                    }
                } else {
                    if (mat [rowHigh - 1] [colHigh - 1] == x) 
                        return true;
                    else
                        return false;
                }
            } 
        }
        return false; 
    }

    /**
     * @description Check if N can be a sum of numbers in S, while S is an array.
     *
     * @param int [] s - the array to search in
     * @param int n - the number to find if is subset sum of some numbers in s.
     *
     * @return boolean - true if exists, false if isn't.
     */ 
    public static boolean isSumOf(int [] s, int n) {
        return isSumOf(s, n, 0);
    }
    
    private static boolean isSumOf(int [] s, int n, int x) {
        if (n < 0 || x == s.length) {
            return false;
        }
        
        if (n == 0) {
            return true;
        }
        
        if (isSumOf(s, n - s[x], x) == true) { 
            return isSumOf(s, n - s[x], x);
        }
        
        return isSumOf(s, n, x + 1);
    }
    
    /**
     * @description find the number of pathes between (x1, y1) to (x2, y2), that doesn't cross the diagonal. 
     *
     * @param int [][] mat - the mat to search in
     * @param int x1 
     * @param int y1 
     * @param int x2 
     * @param int y2 
     *
     * @return int - the number of pathes 
     */     
    public static int numPaths (int[][] mat, int x1, int y1, int x2, int y2) {
        return numPaths(mat, x1, y1, x2, y2, 0);
    }

    private static int numPaths(int[][] mat, int x1, int y1, int x2, int y2, int counter) {
        int tmp;

        if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) {
            return 0;
        } else if (x1 >= mat.length || x2 >= mat.length || y1 >= mat.length || y2 >= mat.length) {
            return 0;
        } else if (mat[x1][y1] == -1 || x1 > y1) {
            return 0;
        }

        if (x1 == x2 && y1 == y2) {
            return 1;
        } else {
            tmp = mat[x1][y1];
            
            mat[x1][y1] = -1;
            counter = numPaths(mat, x1 + 1, y1, x2, y2, counter) +  
                    numPaths(mat, x1 - 1, y1, x2, y2, counter) +
                    numPaths(mat, x1, y1 + 1, x2, y2, counter) +
                    numPaths(mat, x1, y1 - 1, x2, y2, counter);

            mat[x1][y1] = tmp;

            return counter;
        }

    }
}
