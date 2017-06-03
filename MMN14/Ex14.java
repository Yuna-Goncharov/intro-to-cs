import java.util.Arrays;

public class Ex14 {
    
    public static int isSink(int [][] mat) {
        return -1;
    }
    
    public static boolean find (int [][] mat, int x) {
        int row[] = {0};
        int colMin = 0;
        int colMax = mat.length;
        int rowMin = 0;
        int rowMax = 0;
        
        if (mat[0][0] > x) {
            return false;
        }
        
        while (colMin <= colMax) {
            int middle = (colMin + colMax) / 2;
            
            if (mat[middle][0] <= x) {
                System.out.println(Arrays.toString(mat[middle]));
                rowMax = mat[middle].length - 1;
                
                while (rowMin <= rowMax) {
                    middle = (rowMin + rowMax) / 2 ;
                    System.out.println(middle);
                    if (row[middle] == x || row[middle] == rowMin || row[middle] == rowMax) {
                        return true;
                    } else if (row[middle] < x) {
                        rowMin = middle + 1;
                    } else {
                        rowMax = middle - 1;
                    }
                }    
        
            } else if (mat[middle][0] < x) {
                colMin = middle + 1;
            } else {
                colMax = middle - 1;
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