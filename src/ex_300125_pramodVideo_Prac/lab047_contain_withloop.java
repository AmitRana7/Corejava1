package ex_300125_pramodVideo_Prac;

public class lab047_contain_withloop {
    public static void main(String[] args) {
      String[] words ={"Banana","apples","Oranges","Grapes"};
      for (String word : words){
          if (word.contains("a")){
              System.out.println("Contains: 'a'" );
          }
      }
    }
}
