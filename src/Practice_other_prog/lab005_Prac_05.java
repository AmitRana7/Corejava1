package Practice_other_prog;
import java.util.Scanner;
public class lab005_Prac_05 {
    public static void main(String[] args) {
        String [] months = {"January","February","March","April","May","June","July","August","september","October","November","December"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any key to print Month: ");
        String input = sc.nextLine();
        System.out.println("you entered: " +input + "\n");
        for (String day: months){
            System.out.println(day);
        }
    }
}
