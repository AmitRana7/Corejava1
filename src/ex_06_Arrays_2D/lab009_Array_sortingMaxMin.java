package ex_06_Arrays_2D;

public class lab009_Array_sortingMaxMin {
    public static void main(String[] args) {
        int[] array = {25,14,56,15,36,56,77,18,29,49};
        int max_output = give_max(array);
        System.out.println(max_output);
    }
    static int  give_max(int[]array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }

        }
        return max;
    }
}
