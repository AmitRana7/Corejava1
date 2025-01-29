package Code_crkr_270125;
import java.util.Scanner;
public class lab011_UserInput_withChar {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Char Value: ");
            char ch = sc.next().charAt(0);
            System.out.println("You have entered: "  +ch);

    }
}
