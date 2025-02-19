package ex_06_Arrays_2D;

import java.util.Arrays;

public class lab029_Array_large2 {
    public static void main(String[] args) {
        int[] marks = {11,22,44,22,88,33};
        int max = marks[0];

        Arrays.sort(marks);
        System.out.println("Largest Number: " + marks[marks.length-1]);
    }
}
