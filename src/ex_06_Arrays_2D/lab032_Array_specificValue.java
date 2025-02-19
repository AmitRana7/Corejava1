package ex_06_Arrays_2D;

public class lab032_Array_specificValue {
    public static void main(String[] args) {
        String[] names = {"Pramod","Amit Rana","Veer","Preeti"};
        String search = "Veer";

        for (String name : names){
            if (name.equals(search)){
                System.out.println(search);
            }
        }

    }
}
