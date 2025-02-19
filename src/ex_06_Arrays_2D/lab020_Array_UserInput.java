package ex_06_Arrays_2D;
import java.util.Scanner;
public class lab020_Array_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the Name: ");
            names[i]= sc.next();

        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

    }
}
