package ex_300125_pramodVideo_Prac;

public class lab108_StringBuffer_insert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I have  apples.");
        sb.insert(7, 10);
        System.out.println(sb);
    }
}
