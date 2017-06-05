import java.util.Arrays;

public class Ex14 {
    
    public static int isSink(int [][] mat) {
        return -1;
    }
    
    public static boolean find (int [][] mat, int x) {
        int rowLow = 0;
        int colLow = 0;
        int rowHigh = mat.length;
        int colHigh = mat.length;
        
        if (mat[rowLow][colLow] <= x && mat[rowHigh - 1][colHigh - 1] >= x) {

            while (rowLow < rowHigh && colLow < colHigh ) {
                int rowMid = (rowLow + rowHigh) / 2;
                int colMid = (colLow + colHigh) / 2;
                
                // First cell forth quarter
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
                                rowHigh = rowMid + 1;
                                colHigh = colMid;
                            }
                        } 
                        
                        if (mat[rowLow][colMid] < x) {
                            colLow = colMid;
                            rowHigh = rowMid;
                        }
                    } 
                    
                    if (mat[rowMid][colLow] < x) {
                        colHigh = colMid;
                        rowLow = rowMid;
                    } 
                } 
                
                if (mat[rowMid][colMid] < x) {
                    colLow = colMid;
                    rowLow = rowMid;
                }
            }
        }
        
        return false; 
    }
    public static boolean isSumOf(int [] s, int n) {
        return false;
    }
    
    public static int numPaths (int[][] mat, int x1, int y1, int x2, int y2) {
        return -1;
    }
    
}
