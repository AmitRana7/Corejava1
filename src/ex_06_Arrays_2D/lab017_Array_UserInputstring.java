package ex_06_Arrays_2D;
import java.util.Scanner;
public class lab017_Array_UserInputstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");

        int size = sc.nextInt();

        String[] names = new String[size];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the Number: ");
            names[i] = sc.next();
            
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
    } 
    
}
