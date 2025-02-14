package ex_300125_pramodVideo_Prac;

public class lab086_ComareTo_NumericValue {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "99";
        int result = str1.compareTo(str2);
        System.out.println(result);
    }
}
// =====Lexicographically, "1" comes before "9", so "123" is smaller than "99".====