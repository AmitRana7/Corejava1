package ex_300125_pramodVideo_Prac;

public class lab076_Substring_char {
    public static void main(String[] args) {
        String email = "abc@gmail.com";
        String result = email.substring(email.indexOf("@") +1);
        System.out.println(result);
    }
}
