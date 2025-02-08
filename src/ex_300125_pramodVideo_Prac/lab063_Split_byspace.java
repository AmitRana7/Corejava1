package ex_300125_pramodVideo_Prac;

public class lab063_Split_byspace {
    public static void main(String[] args) {
        String text = "Java@is@Fun";
        String[] result = text.split("@");
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}
