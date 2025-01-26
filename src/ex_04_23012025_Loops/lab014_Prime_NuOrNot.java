package ex_04_23012025_Loops;
import java.util.*;
public class lab014_Prime_NuOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isprime = true;
        for (int i=2; i<=n; i++){
            if (n % 1 ==0){
                isprime = false;
                break;
            }
        }
        if (isprime){
            if (n==1){
                System.out.println("This is neither prime nor composite no.");
            }else {
                System.out.println("This is a prime number");
            }
        }else {
            System.out.println("This is not a prime number");
        }
    }

}
