package ex_06_Arrays_2D;

public class lab031_Array_Avg {
    public static void main(String[] args) {
        int[] marks = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num: marks ){
            sum = sum + num;
        }
        double average = (double)  sum/marks.length;
        System.out.println("Average: "  +average );
    }
}
