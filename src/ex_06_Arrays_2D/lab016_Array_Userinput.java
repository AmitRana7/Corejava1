package ex_06_Arrays_2D;
import java.util.Scanner;
public class lab016_Array_Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the Number: ");
            numbers[i] = sc.nextInt();

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
