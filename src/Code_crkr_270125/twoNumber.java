package Code_crkr_270125;
import java.util.Scanner;
public class twoNumber {
    int add;
    twoNumber(int x , int y){
       add = x + y;
        System.out.println("Result: " +add);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();

        twoNumber obj = new twoNumber(a,b);
    }
}

/*
*/