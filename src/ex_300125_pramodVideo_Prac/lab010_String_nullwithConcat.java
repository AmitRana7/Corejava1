package ex_300125_pramodVideo_Prac;

public class lab010_String_nullwithConcat {
    public static void main(String[] args) {
         String str1 = "Real ";
         String str2 = null ;
         String result = str1.concat(String.valueOf(str2));
        System.out.println(result);
    }
}
