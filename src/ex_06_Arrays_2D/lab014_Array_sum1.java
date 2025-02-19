package ex_06_Arrays_2D;

public class lab014_Array_sum1 {
    public static void main(String[] args) {
        int[] numbers = {12,15,16,17,18};
        int sum =0;
        for (int n : numbers){
            sum = sum + n;
            System.out.println(sum);
        }
    }
}
