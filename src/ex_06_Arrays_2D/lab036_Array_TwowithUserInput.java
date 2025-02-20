package ex_06_Arrays_2D;
import java.util.Scanner;
public class lab036_Array_TwowithUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the 6 Element: ");
        int[][] matrix = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();

            }

        }
        System.out.println("Enter the Matrix is: ");
        for (int[] row : matrix){
            for (int col :row){

                System.out.print(col + "|");
            }
            System.out.println();
        }

    }
}
