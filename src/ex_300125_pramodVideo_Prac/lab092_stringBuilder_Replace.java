package ex_300125_pramodVideo_Prac;

public class lab092_stringBuilder_Replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.replace(6,11,"Java");
        System.out.println(sb);
    }
}
