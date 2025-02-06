package ex_300125_pramodVideo_Prac;

public class lab046_contain_conditionStmt {
    public static void main(String[] args) {
        String email = "amitrana@gmail.com";
        if (email.contains("@")){
            System.out.println("Email is valid");
        }else {
            System.out.println("Email is not Valid");
        }
    }
}
