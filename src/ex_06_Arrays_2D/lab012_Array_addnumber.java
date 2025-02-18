package ex_06_Arrays_2D;

public class lab012_Array_addnumber {
    public static void main(String[] args) {
        int[] number = {12,34,10};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
            System.out.println(sum);


        }
        System.out.println("_____________");
        System.out.println(sum);

    }
}
