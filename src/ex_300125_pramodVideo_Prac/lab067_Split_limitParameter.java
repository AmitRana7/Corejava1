package ex_300125_pramodVideo_Prac;

public class lab067_Split_limitParameter {
    public static void main(String[] args) {
        String month = "June,July,August,December";
        String[] result = month.split(",", 4);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);
    }
}
