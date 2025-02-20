package ex_06_Arrays_2D;

public class lab043_Array_EvenNumber {
    public static void main(String[] args) {

        int[] even = new int[5];
        for (int i = 0; i < even.length; i++) {
            even[i] = (i+1)*2;
            System.out.println("Even Number: " +even[i]);

        }
    }
}
