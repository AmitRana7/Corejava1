package ex_03_21012025_ConditionalStmt;
import java.util.*;
public class lab002_Ageif_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }
}
