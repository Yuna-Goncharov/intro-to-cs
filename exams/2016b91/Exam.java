public class Exam {
    public static void main(String[] args) {
        int[][] maze1 = {
            { 1, 0, 3, 3 },
            { 3, 0, 1, 1 },
            { 3, 0, 0, 0 },
            { 0, 3, 3, 1 },
        };

        int[][] maze2 = {
            { 1, 1, 3, 3 },
            { 3, 0, 1, 1 },
            { 3, 0, 0, 0 },
            { 1, 3, 3, 1 },
        };

        int[][] maze3 = {
            { 1, 1, 3, 3 },
            { 3, 0, 1, 1 },
            { 3, 0, 0, 1 },
            { 1, 3, 3, 1 },
        };

        System.out.println("Should be 0: " + minDragons(maze1));
        System.out.println("Should be 1: " + minDragons(maze2));
        System.out.println("Should be 4: " + minDragons(maze3));

        int[] arr = [ 2, 3, 8, 14, 15, 35 ];

        System.out.print("Should be true: " + findAvarge(arr, 8));
        System.out.print("Should be true: " + findAvarge(arr, 2.5));
        System.out.print("Should be true: " + findAvarge(arr, 10));
        System.out.print("Should be false: " + findAvarge(arr, 8.5));
    }

    public static int minDragons(int[][] maze) {
        return minDragons(maze, 0, 0);
    }

    private static int minDragons(int[][] maze, int row, int col) {
        if (row == maze.length - 1 || col == maze[row].length - 1) { 
            return 0;
        }

        if (maze[row][col] == 0) {
            return minDragons(maze, row + 1, col);
        }
        
        if (maze[row][col] == 1) {
            return minDragons(maze, row, col + 1);
        }

        return 1 + minDragons(maze, row, col + 1);
    }

    public static boolean findAvarge(int[] arr, double x) {
        
    }
}