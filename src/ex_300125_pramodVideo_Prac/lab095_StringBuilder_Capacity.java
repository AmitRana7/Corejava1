package ex_300125_pramodVideo_Prac;

public class lab095_StringBuilder_Capacity {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.capacity();
        System.out.println(sb);
        sb.append("Hello Java world Is Good");
        System.out.println(sb.capacity());
    }
}
