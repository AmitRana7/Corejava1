package ex_300125_pramodVideo_Prac;

public class lab080_TolowerCase_lastpart {
    public static void main(String[] args) {
        String text = "GOOGLE.COM";
        String result = text.substring(text.lastIndexOf(".")+1).toLowerCase();
        System.out.println(result);
    }
}
// Last part >small part>particular part