package Code_crkr_270125;
import java.util.Scanner;
public class lab016_Print_nNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Value of n: ");
        int n = sc.nextInt();


        System.out.println("Printing "  +num1+ "of" +n+ "times: " );
        for (int i=0; i<n; i++)
            System.out.println(num1+ " ");
    }
}
