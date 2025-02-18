package ex_06_Arrays_2D;

public class lab010_Array_SortingMin {
    public static void main(String[] args) {
        int[] array = {25,14,56,15,36,56,77,18,29,49};
        int min_output = give_min(array);
        System.out.println(min_output);


    }
    static int give_min(int[]array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];

            }

        }
        return min;
    }
}
