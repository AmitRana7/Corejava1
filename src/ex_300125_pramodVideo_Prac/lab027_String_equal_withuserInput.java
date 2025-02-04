package ex_300125_pramodVideo_Prac;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;
public class lab027_String_equal_withuserInput {
    public static void main(String[] args) {
        String password = "Secure@123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Password: ");
        String input = sc.nextLine();
       // String password = "Secure@123";

        if (input.equals(password)){
            System.out.println("Password is Protected");

        }else {
            System.out.println("Password is not Protected");
        }
//Q: How do you check if a user input matches a predefined string?
    }


}
