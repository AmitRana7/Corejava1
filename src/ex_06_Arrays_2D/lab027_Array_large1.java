package ex_06_Arrays_2D;

public class lab027_Array_large1 {
    public static void main(String[] args) {
        int[] marks ={10,215,12,56,85};
        int max = marks[0];

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max){
                max = marks[i];
            }

        }
        System.out.println(max);
    }
}
