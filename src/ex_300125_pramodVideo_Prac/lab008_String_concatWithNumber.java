package ex_300125_pramodVideo_Prac;

public class lab008_String_concatWithNumber {
    public static void main(String[] args) {
        String greet = "Hello ";
        int num = 100;
        String result = greet.concat(String.valueOf(num));
        System.out.println("Concat convert int to string : " + " "  +result);
    }
}


