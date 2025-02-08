package ex_300125_pramodVideo_Prac;

public class lab064_Split_Bycomma {
    public static void main(String[] args) {
        String text = "apple,orange,banana";
        String[] result = text.split(",");
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}
