package ex_06_Arrays_2D;
import java.util.Scanner;
public class lab037_Array_UserInputString_TwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        int[][] marks = new int[3][3];

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();

            }
        }
        System.out.println("Matrix Value is: ");
        for (int[] row : marks){
            for (int col: row){
                System.out.print(col + "|");
            }
            System.out.println();
        }

    }

}
