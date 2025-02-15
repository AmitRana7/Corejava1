package ex_300125_pramodVideo_Prac;

public class lab083_StringBuilder_delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Java");
        sb.delete(6, 10);
        System.out.println(sb);
    }
}
