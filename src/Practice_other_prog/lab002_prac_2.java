package Practice_other_prog;
import java.util.Scanner;
public class lab002_prac_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1, sub2, sub3;
        System.out.println(" Enter the marks of Physics");
         sub1 = sc.nextInt();
        System.out.println("Enter the marks of Biology");
        sub2 = sc.nextInt();
        System.out.println("Enter the marks of Computer");
        sub3 = sc.nextInt();

        float avg = (sub1+sub2+sub3)/3.0f;
        System.out.println("Your overall Percentage is : "  +avg);
        if (avg>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("Congrulation, you have Passed ");
        }else {
            System.out.println("Sorry, you have Fail try again");
        }
    }
}
