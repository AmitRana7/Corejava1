package ex_300125_pramodVideo_Prac;

public class lab021_String_CompareLength {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Banana";
        if (str1.length() > str2.length()){
            System.out.println(str1 + "is better than" +str2);
        }else if (str1.length() < str2.length()){
            System.out.println(str2 + " is better then " +str1);
        }else {
            System.out.println("Both are same fruit");
        }
    }
}
