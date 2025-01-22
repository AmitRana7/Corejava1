package ex_03_21012025_ConditionalStmt;
import java.util.*;
public class lab005_Switch_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
                default:
                    System.out.println("invalid Button");
        }
    }

}
