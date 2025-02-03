package ex_300125_pramodVideo_Prac;

public class lab005_String_withPlusoperator {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
      //  String fullName = firstName + " " + lastName;
        //System.out.println( "Enter the FullName: " + " " + fullName);
       // String fullName = firstName.concat(lastName);
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
    }
}
