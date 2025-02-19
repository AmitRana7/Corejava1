package ex_06_Arrays_2D;

import java.util.Arrays;

public class lab026_Array_LargestElement {
    public static void main(String[] args) {
        int[] marks = {10,50,30,90,40};
        int max = marks[0];

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max){
                max = marks[i];
            }
            
        }
        System.out.println(max);

    }
}
