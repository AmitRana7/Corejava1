package ex_300125_pramodVideo_Prac;

public class lab068_Split_LimitNumber {
    public static void main(String[] args) {
        String text = "A-B-C-D-E";
        String[] result = text.split("-", 4);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);

    }
}
