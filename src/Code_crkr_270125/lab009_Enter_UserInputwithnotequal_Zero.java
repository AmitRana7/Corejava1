package Code_crkr_270125;
import java.util.Scanner;
public class lab009_Enter_UserInputwithnotequal_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int a = sc.nextInt();
        while (a!=0)
            a = sc.nextInt();
        System.out.println("Result: "  +a);
    }
}
