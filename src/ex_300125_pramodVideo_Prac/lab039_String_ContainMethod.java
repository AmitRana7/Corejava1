package ex_300125_pramodVideo_Prac;

import java.util.HexFormat;

public class lab039_String_ContainMethod {
    public static void main(String[] args) {
//        String text = "HELLO";
//        String text1 = "hol";
//        System.out.println(text.contains("He"));
//        System.out.println(text.contains("lo"));
//        System.out.println(text.contains("Hi"));
//        System.out.println(text.toLowerCase().contains("hello"));
//        System.out.println(text.toUpperCase().contains("HELLO"));
//        boolean contains = text.toUpperCase().contains(text1.toUpperCase());
//        System.out.println("contains: "  +contains);
//    }
        String str1 = "HELLO WORLD";
        String str2 = "WORLD";

        boolean contains = str1.toLowerCase().contains(str2.toLowerCase());
        System.out.println("Contains (ignore case): " + contains);
//       String str1 = "Hello";
//       String str2 = "HEL";
//
//        boolean contains = str1.toUpperCase().contains(str2.toUpperCase());
//        System.out.println("Contains (ignore case): " + contains);
    }
}
