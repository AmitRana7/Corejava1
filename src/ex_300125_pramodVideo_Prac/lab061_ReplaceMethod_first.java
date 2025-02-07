package ex_300125_pramodVideo_Prac;

public class lab061_ReplaceMethod_first {
    public static void main(String[] args) {
        String text = "Core Java";
        System.out.println(text.replace('C' , 'c')); //Change the first letter.
        System.out.println(text.replace(" " ,"_")); // change Space with Underscore.
        System.out.println(text.replace("o" , "")); // replace with character.
        System.out.println(text.replace("Core", "1234")); // replace with numeric value
        System.out.println(text.replace(" " ,"@")); // replace with special character.
        System.out.println(text.replace(" " , " \n"));
    }
}
