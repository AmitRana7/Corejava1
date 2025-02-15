package ex_300125_pramodVideo_Prac;

public class lab097_StringBuilder_CharAt {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Java");
        sb.setCharAt(2, 'T');
        System.out.println(sb);
    }
}
