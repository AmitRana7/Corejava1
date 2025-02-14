package ex_300125_pramodVideo_Prac;

public class lab085_compareTo_emptystring {
    public static void main(String[] args) {
        String str1 = " ";
        String str2 = "Hello";
        int result = str1.compareTo(str2);
        System.out.println(result);
    }
}
//====An empty string is always considered smaller than a non-empty string.==