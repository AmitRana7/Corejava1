package ex_300125_pramodVideo_Prac;

import java.util.Scanner;

public class lab083_toupperCase_Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String text = sc.nextLine();
        System.out.println("Input: " +text.toUpperCase());
    }
}
