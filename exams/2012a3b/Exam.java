public class Exam {
    
    public static void main(String[] args) {
        int[][] mat = { 
            {8, 4, 2, 4, 3},
            {6, 3, 8, 4, 5},
            {1, 4, 4, 9, 7},
            {2, 1, 7, 6, 5},
        };

        printPathWeights(mat);
    }

    public static void printPathWeights(int[][] m) {
        printPathWeights(m, 0, 0, 0);
    }

    private static void printPathWeights(int[][] m, int col, int row, int sum) {
        System.out.println(sum + m[row][col]);
        if (col > m[row].length && row > m.length) { 
            if (col == m[row].length - 1 && row == m.length - 1) {
                System.out.println(sum + m[row][col]);
            } else {
                printPathWeights(m, col + 1, row, sum + m[row][col]);
                printPathWeights(m, col - 1, row, sum + m[row][col]);
                printPathWeights(m, col, row + 1, sum + m[row][col]);
                printPathWeights(m, col, row - 1, sum + m[row][col]);
            }
        }
    }
}