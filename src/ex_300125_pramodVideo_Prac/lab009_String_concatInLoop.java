package ex_300125_pramodVideo_Prac;

public class lab009_String_concatInLoop {
    public static void main(String[] args) {
        String result = "";

        for (int i =1; i<=3; i++){
            result = result.concat("Item" + i + " ");
        }
        System.out.println(result);
    }

}
