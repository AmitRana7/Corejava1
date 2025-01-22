package ex_03_21012025_ConditionalStmt;
import java.util.*;
public class lab001_ifelse_syntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x % 2 ==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
