package ex_06_Arrays_2D;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class lab019_Array_userInputwithBoolean {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of boolean array: ");
        int size = sc.nextInt();

        boolean[] value = new boolean[size];
        for (int i = 0; i < value.length; i++) {
            value[i] = sc.nextBoolean();
           System.out.println("Enter the Condition: ");//Step:1 Ask the user for the size of the array.
        }                                             // step:2 Initialize the boolean array
            for(boolean value1 : value){             // step :3  Prompt the user to enter boolean values
                                                    // step:4 Print the boolean array
            System.out.println(value1);

        }
        }

    }
