import java.util.Arrays;

public class Ex14 {
    
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
        }

        if (sink >= 0) {
            return sink;
        }

        return -1;
    }
    
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
                        // First cell third quarter
                        if (mat[rowMid][colLow] == x) {
                            return true;
                        } 
                        
                        if (mat[rowMid][colLow] > x) {
                            // First cell second quarter
                            if (mat[rowLow][colMid] == x) {
                                return true;
                            }
                            
                            if (mat[rowLow][colMid] > x) {

                                // First cell first quarter
                                if (mat[rowLow][colLow] == x) {
                                    return true;
                                }
                                
                                if (mat[rowLow][colLow] < x) {
                                    // Here is the problem
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
    
    public static int numPaths (int[][] mat, int x1, int y1, int x2, int y2) {
        return -1;
    }

    private static void printMat(
        int rowHigh, int rowLow, int rowMiddle, int colHigh, int colLow, int colMiddle
    ) {
        System.out.println("=======================");        
        System.out.println("Row high: "   + rowHigh);
        System.out.println("Row low: "    + rowLow);
        System.out.println("Row middle: " + rowMiddle);
        System.out.println("Col high: "   + colHigh);
        System.out.println("Col Low: "    + colLow);
        System.out.println("Col Middle: " + colMiddle);

    }    
}
