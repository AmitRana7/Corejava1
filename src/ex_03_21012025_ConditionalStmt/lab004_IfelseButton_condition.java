package ex_03_21012025_ConditionalStmt;
import java.util.*;
public class lab004_IfelseButton_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if ( button == 1){
            System.out.println("Hello");
        }
        else if (button == 2){
            System.out.println("Namaste");
        }
        else if (button == 3){
            System.out.println("Bonjour");
        }
        else {
            System.out.println("Invalid Button");
        }
    }
}
