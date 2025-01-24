package ex_03_21012025_ConditionalStmt;

import java.util.Scanner;

public class lab012_switch_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.println("Enter operator : ");
        char operator = sc.next().charAt(0);
        int r = 0;
        switch(operator){
            case : "+"
                r = a + b;
                System.out.println(a+ "+" +b+ "=" +r );
            break;
            case : "-"
                r = a - b;
                System.out.println(a+ "-" +b+ "=" +r );
                break;
            case : '*'
                r = a * b;
                System.out.println(a+ "*" +b+ "=" +r );
                break;
            case : '%'
                r = a % b;
                System.out.println(a+ "%" +b+ "=" +r );
                break;
            default:
                System.out.println("Invalid operator");

        }
    }
}
