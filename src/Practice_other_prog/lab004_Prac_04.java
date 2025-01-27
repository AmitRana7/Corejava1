package Practice_other_prog;

import java.util.Scanner;

//import java.util.Scanner;
public class lab004_Prac_04 {
    public static void main(String[] args) {
        String[] weekdays = {"Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","sunday"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any keys to display weekdays");
        String userInput = sc.nextLine();
        System.out.println( "Display the weekdays: " +userInput);
        for (String day : weekdays){
            System.out.println(day);
        }





    }
}
