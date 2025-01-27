package Practice_other_prog;
import java.util.Scanner;
public class lab003_Prac_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter The value : ");
        n = sc.nextInt();
        System.out.println("Enter the Multiplication of : " +n);
        for (int i=1; i<=10;i++){
            System.out.println(n+"*"+i+"=" +(n*i));
        }
    }
}
