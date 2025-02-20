package ex_06_Arrays_2D;

public class lab044_Array_Squareroot {
    public static void main(String[] args) {

        int[] Square = new int[5];

        for (int i = 0; i < Square.length; i++) {
            Square[i] = (i+1) * (i+1);
            System.out.println("Square Root: " +Square[i]);

        }
    }
}
