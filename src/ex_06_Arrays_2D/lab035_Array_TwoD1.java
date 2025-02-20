package ex_06_Arrays_2D;

public class lab035_Array_TwoD1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + "|");
            }
            System.out.println();
        }
    }
}