package ex_03_21012025_ConditionalStmt;
import java.util.*;
public class lab003_TwoNumber_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println("Equal");
        }
        else if(a > b){
            System.out.println("A is Greater");
        }
        else{
            System.out.println("A is Lesser");
        }
    }
}