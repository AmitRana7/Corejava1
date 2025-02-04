package ex_300125_pramodVideo_Prac;

public class lab029_String_Equalwitharray {
    public static void main(String[] args) {
        String[] words = {"Java","python","Sql"};
       String target = "Java";
        for (String word: words){
            if (word.equals(target)){
                System.out.println("Found: "  +word);

            }
        }
    }
}
//Q: How do you check if a word exists in an array?