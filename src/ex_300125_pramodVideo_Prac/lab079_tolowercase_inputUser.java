package ex_300125_pramodVideo_Prac;

import java.util.Scanner;

public class lab079_tolowercase_inputUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String text = sc.nextLine();
        System.out.println("Lower Case: " +text.toLowerCase());
    }
}
