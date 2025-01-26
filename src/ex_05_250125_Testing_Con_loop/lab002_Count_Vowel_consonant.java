package ex_05_250125_Testing_Con_loop;
import java.util.*;
public class lab002_Count_Vowel_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ask the user to type something
        System.out.print("Enter the String : ");
        String text = sc.next();
        int vowel = 0;
        int cons = 0;
        for (int i =1; i<=text.length(); i++){
            char ch = text.charAt(i);

            if (ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("Vowel " +vowel++);
                vowel++;
            }else if (ch>='a' && ch<='z'){
                System.out.println("Consonant "  +cons++);
                cons++;
            }

        }

    }
}
