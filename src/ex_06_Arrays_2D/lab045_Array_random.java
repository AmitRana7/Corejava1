package ex_06_Arrays_2D;

public class lab045_Array_random {
    public static void main(String[] args) {
        int[][]random = new int[3][3];

        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                random[i][j] = (int) (Math.random() *100);
                System.out.println(random[i][j]);

            }
            
        }
    }
}
