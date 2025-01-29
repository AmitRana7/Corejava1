package Code_crkr_270125;
import java.util.Scanner;
public class lab012_String_userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        String str = sc.next();
        System.out.println("You have entered: "  +str);

    }
}
//The next() method is used to scan a single word, name, or any string without space(s).