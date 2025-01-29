package Code_crkr_270125;
import java.util.InputMismatchException;
import java.util.Scanner;
public class lab010_UserInput_withtrycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer value: ");
        try {
            int a = sc.nextInt();
            System.out.println("Enter the Value: " + a);
        }
            catch(InputMismatchException ime){
                System.out.println("Invalid Value");

            }

    }
}
// we need to put the scanner statement inside the try block, so that, we can catch that
// exception using the catch block. Here is the complete version of the code,
// created after modifying the first program of this article.
// This program handles with invalid input:

