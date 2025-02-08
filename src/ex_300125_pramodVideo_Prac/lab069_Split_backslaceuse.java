package ex_300125_pramodVideo_Prac;

public class lab069_Split_backslaceuse {
    public static void main(String[] args) {
        String text = "Java1Script2c2cc++java22Script";
        String[] result = text.split("\\d", 5);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);
    }
}
//=================Break from digits part===============