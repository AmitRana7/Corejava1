package ex_06_Arrays_2D;

public class lab025_Array_sum1 {
    public static void main(String[] args) {
         int[] numbers = {2,4,5,6,7};
         int sum = 0;
         for (int num : numbers){
             sum = sum + num;
             System.out.println(sum);
         }
    }
}
