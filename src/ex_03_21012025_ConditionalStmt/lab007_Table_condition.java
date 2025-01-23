package ex_03_21012025_ConditionalStmt;
import java.util.*;
public class lab007_Table_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.  print("Enter the no.: ");
        int num = sc.nextInt();
       System.out.println("Multiplication Table of: "  +num+"___");
        for(int i=1; i<=10 ; i++ )
            System.out.println(num+ "*" +i+ "="+ (num*i));
    }
}
