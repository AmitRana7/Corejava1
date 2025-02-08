package ex_300125_pramodVideo_Prac;

public class lab065_Split_Splitbydot {
    public static void main(String[] args) {
        String text = "Google.com";
        String[] result = text.split("\\.");
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}