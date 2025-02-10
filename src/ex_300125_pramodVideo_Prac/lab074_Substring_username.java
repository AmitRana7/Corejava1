package ex_300125_pramodVideo_Prac;

public class lab074_Substring_username {
    public static void main(String[] args) {
        String email = "abc@gmail.com";
        String username = email.substring(email.indexOf("@")+1);
        System.out.println(username);
    }
}
