public class Exam {
    
    public static void main(String[] args) {
        int mat[][] = {
            {2, 6, 5, 4},
            {3, 17, 2, 6},
            {1, 3, 21, 0},
        };

        int mat2[][] = {
            {2, 80, 5, 4},
            {3, 17, 2, 6},
            {1, 3, 21, 0},
        };

        int mat3[][] = {
            {2, 80, 5, 4},
            {3, 17, 2, 6},
            {1, 3, 900, 0},
        };

        System.out.println(maxRow(mat));
        System.out.println(maxRow(mat2));
        System.out.println(maxRow(mat3));
    }

    public static int maxRow(int[][] mat) {
        return maxRow(mat, 0, 0, 0);
    }

    public static int maxRow(int[][] mat, int index, int sum, int biggest) {
        if (index == mat.length) {
            return biggest;
        }

        int currentSum = getRowSum(mat[index], 0);

        if (currentSum > sum) {
            return maxRow(mat, index + 1, currentSum, index);
        }

        return maxRow(mat, index + 1, sum, biggest);
    }

    private static int getRowSum(int[] row, int index) {
        if (index == row.length - 1) {
            return row[index];
        } 

        return row[index] + getRowSum(row, index + 1);
    }
}