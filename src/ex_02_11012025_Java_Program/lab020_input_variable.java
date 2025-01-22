package ex_02_11012025_Java_Program;
import java.util.*;
public class lab020_input_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String name = firstName + lastName;
        System.out.println(name);

    }
}
