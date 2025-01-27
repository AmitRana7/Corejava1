package Practice_other_prog;
import java.util.Scanner;
public class lab001_Prac_1 {
    public static void main(String[] args) {
        int age = 0 ;
        System.out.print("Enter the age: ");
        Scanner sc = new Scanner(System.in);
           age = sc.nextInt();
        if (age>=56){
            System.out.println("You are Experienced");
        }  if (age>=46) {
            System.out.println("You are Semi-Experienced");
        }  if (age>=36) {
            System.out.println("You are semi-semi Experienced");
        }else {
            System.out.println("You are not Experienced");
        }

    }
}
