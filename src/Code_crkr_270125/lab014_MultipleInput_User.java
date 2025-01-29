package Code_crkr_270125;
import java.util.Scanner;
public class lab014_MultipleInput_User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Number to Enter: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter "  +n+    "Number:  ");
        for (int i=0; i<n; i++)
        arr[i] = sc.nextInt();

        System.out.print("You have Entered: ");
        for (int i=0; i<n; i++)
            System.out.println(arr[i]+ " ");
    }
}
