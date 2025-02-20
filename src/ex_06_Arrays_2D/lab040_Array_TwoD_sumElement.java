package ex_06_Arrays_2D;

public class lab040_Array_TwoD_sumElement {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2}, {3, 4}, {5, 6} };
        int sum = 0;

        for (int[] row : matrix){
            for (int col : row){
                sum = sum + col;
            }
        }
        System.out.println("Sum Of Value: " +sum);
    }
}
