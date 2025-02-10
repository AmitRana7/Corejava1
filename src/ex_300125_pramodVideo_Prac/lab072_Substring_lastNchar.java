package ex_300125_pramodVideo_Prac;

public class lab072_Substring_lastNchar {
    public static void main(String[] args) {
        String text = "Java Programing";
        String lastFour = text.substring(text.length()-4);
        System.out.println(lastFour);
    }
}
