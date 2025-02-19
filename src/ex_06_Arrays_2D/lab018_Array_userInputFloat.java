package ex_06_Arrays_2D;
import java.util.Scanner;
public class lab018_Array_userInputFloat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int size = sc.nextInt();

        float[] value = new float[size];
        for (int i = 0; i < value.length; i++) {
            System.out.println("Enter the Value: ");
            value[i]= sc.nextFloat();


        }
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);

        }

    }
}
