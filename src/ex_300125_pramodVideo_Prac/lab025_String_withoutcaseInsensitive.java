package ex_300125_pramodVideo_Prac;

public class lab025_String_withoutcaseInsensitive {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
//equalsIgnoreCase() ignores case differences.