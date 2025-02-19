package ex_06_Arrays_2D;

import java.util.Arrays;

public class lab030_Array_lowest2 {
    public static void main(String[] args) {
        int[] marks = {11,22,44,22,88,33};
        int min = marks[0];

        Arrays.sort(marks);
        System.out.println("Lowest Number: " +marks[0]);
    }
}
