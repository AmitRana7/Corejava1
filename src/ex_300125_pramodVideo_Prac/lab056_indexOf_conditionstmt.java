package ex_300125_pramodVideo_Prac;

public class lab056_indexOf_conditionstmt {
    public static void main(String[] args) {
        String email = "abcd@gmail.com";
        if (email.indexOf('@')!= -1){
            System.out.println("Vaild Email Id");
        }else {
            System.out.println("Not Valid Email Id");
        }
    }
}
