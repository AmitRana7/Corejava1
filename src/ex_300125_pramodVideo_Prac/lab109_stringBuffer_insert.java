package ex_300125_pramodVideo_Prac;

public class lab109_stringBuffer_insert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("is");
        sb.insert(0,"Java ");
        sb.append(" Fun Programming");
        System.out.println(sb);
    }
}
