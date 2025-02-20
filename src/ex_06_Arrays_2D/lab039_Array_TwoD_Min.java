package ex_06_Arrays_2D;

public class lab039_Array_TwoD_Min {
    public static void main(String[] args) {
        int[][] matrix = { {3, 7, 9}, {2, 5, 1}, {8, 6, 4} };
        int min = matrix[0][0];

        for (int[] row : matrix){
            for (int col : row){
                if (col < min) {
                    min = col;
                }
            }
        }
        System.out.println("Lowest Value: "  + min );
    }
}
