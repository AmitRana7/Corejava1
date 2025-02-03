package ex_300125_pramodVideo_Prac;
import java.util.*;
public class lab011_String_concat_UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter the last Name: ");
        String lastName = sc.nextLine();

        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(" Enter the Full Name: "  +fullName);
    }
}
// How do you concatenate user input with concat()?