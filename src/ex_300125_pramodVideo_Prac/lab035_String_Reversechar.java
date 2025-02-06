package ex_300125_pramodVideo_Prac;

public class lab035_String_Reversechar {
    public static void main(String[] args) {

        String text = "Java";
        String empty = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            empty += text.charAt(i);
        }
        System.out.println("Reversed: " + empty);
    }
}
//Reverse a String Using charAt()