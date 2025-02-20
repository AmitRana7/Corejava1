package ex_06_Arrays_2D;

public class lab038_Array_TwoD_LargeElemnt {
    public static void main(String[] args) {
        int[][] matrix = { {3, 7, 9}, {2, 5, 1}, {8, 6, 4} };
        int max = matrix[0][0];

        for (int[] row : matrix){
            for (int col : row){
                if (col > max){
                    max = col;
                }
            }
        }
        System.out.println("Largest Number: " +max);
    }
}
