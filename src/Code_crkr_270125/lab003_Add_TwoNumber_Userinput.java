package Code_crkr_270125;
import java.util.Scanner;
public class lab003_Add_TwoNumber_Userinput {
    public static void main(String[] args) {
        int num1, num2, add;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First value: ");
        num1 = sc.nextInt();
        System.out.print("Enter the Second Value: ");
        num2 = sc.nextInt();
        add = num1 + num2;
        System.out.println("Result: "   +add);
    }
}
