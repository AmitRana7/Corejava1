package ex_06_Arrays_2D;

public class lab028_Array_lowestValue {
    public static void main(String[] args) {
        int[] marks = {33,22,55,88,11,44};
        int min = marks[0];

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min){
                min = marks[i];
            }

        }
        System.out.println(min);
    }
}
