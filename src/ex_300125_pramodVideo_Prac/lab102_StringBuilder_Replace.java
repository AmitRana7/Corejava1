package ex_300125_pramodVideo_Prac;

public class lab102_StringBuilder_Replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Red is my Favorite color");
        sb.replace(0,3,"Blue");
        System.out.println(sb);
        sb.replace(0, 4,"Green");
        System.out.println(sb);
    }
}
