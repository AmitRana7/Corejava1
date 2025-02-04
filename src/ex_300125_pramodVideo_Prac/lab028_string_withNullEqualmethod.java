package ex_300125_pramodVideo_Prac;

public class lab028_string_withNullEqualmethod {
    public static void main(String[] args) {
        String str = null;
        if ("Java".equals(str)){
            System.out.println("Found Match");
        }else {
            System.out.println("No Match Found");
        }
    }
}
