package ex_300125_pramodVideo_Prac;

public class lab030_howMatch_twolist {
    public static void main(String[] args) {
        String[] list1 = {"Apple","Banana","Orange"};
        String[] list2 = {"Banana","Pineapple","Apple"};

        for (String word1 : list1){
            for (String word2 : list2){
                if (word1.equals(word2)){
                    System.out.println("Match Found: " +word2);
                }//else {
                 //System.out.println("Match not Found: ");
                //}
            }
        }

    }
}
//How do you find matching words in two lists?

