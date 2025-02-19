package ex_06_Arrays_2D;

import java.util.Arrays;

public class lab015_Array_SecondlargeNo {
    public static void main(String[] args) {
        int[] numbers = {10,12,34,1,77};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length-2; i++) {
            System.out.println(numbers[i]);
        }
        //System.out.println(numbers[numbers.length -2]);
    }
}
