package ex_300125_pramodVideo_Prac;

public class lab110_stringBuffer_insertMul {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" World");
        sb.insert(5," Java");
        System.out.println(sb);
    }
}
