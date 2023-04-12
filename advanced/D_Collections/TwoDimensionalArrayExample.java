package pl.sdacademy.java.advanced.D_Collections;

public class TwoDimensionalArrayExample {
    public static void printOut2DArray() {

        String[][] grid = new String[][] {
                new String[] {"O", "X", "O"},
                new String[] {"X", "X", "X"},
                new String[] {"X", "O", "X"},
                new String[] {"O", "O", "X"},
                new String[2]
        };
        System.out.println(grid.length + "x" + grid[0].length);

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
