import java.util.Arrays;

public class Ex14 {
    
    public static int isSink(int [][] mat) {
        return -1;
    }
    
    public static boolean find (int [][] mat, int x) {
        int i1=0; 
        int j1=0;
        int i2=mat.length , j2 = mat.length;
        boolean found = false;
        
        if (mat[i1][j1] <= x && mat[i2-1][j2-1] >= x){
        
            while (!found && i1 < i2 && j1 < j2 ) {
                int middle_i = (i1 + i2) / 2;
                int middle_j = (j1 + j2) / 2;
                
                // First cell forth quarter
                if (mat[middle_i][middle_j] == x) {
                    return found = true; 
                }
                else if (mat[middle_i][middle_j] > x) {
                    // First cell third quarter
                    if (mat[middle_i][j1] == x) {
                        return found = true;
                    }
                    else if (mat[middle_i][j1] > x) {
                        // First cell second quarter
                        if (mat[i1][middle_j] == x) {
                            return found = true;}
                        else if (mat[i1][middle_j] > x) {
                            // First cell first quarter
                            if (mat[i1][j1] == x) {
                                return found = true;
                            }
                            else if (mat[i1][j1] < x) {
                                i2 = middle_i -1;
                                j2 = middle_j ;
                            }}
                        else if (mat[i1][middle_j] < x) {
                            j1 = middle_j;
                            i2 = middle_i;
                        }}
                    else if (mat[middle_i][j1] < x) {
                        j2 = middle_j;
                        i1 = middle_i;
                    }
                }
        
                else if (mat[middle_i][middle_j] < x) {
                   
                    j1 = middle_j;
                    i1 = middle_i;
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
