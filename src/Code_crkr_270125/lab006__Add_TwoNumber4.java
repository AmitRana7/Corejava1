package Code_crkr_270125;
import java.util.Scanner;
public class lab006__Add_TwoNumber4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.println("Result: " +add(a,b));
        System.out.println("Thank You");
    }
     public static int add(int x, int y){
        return (x+y);
    }
               /*----Add Two Numbers in Java using Function-----
    This program is created to show, how the addition of two numbers can be performed
    in Java using a user-defined function. That is, a function named add() is created,
    that takes two arguments and returns the addition result of its arguments.*/

}
