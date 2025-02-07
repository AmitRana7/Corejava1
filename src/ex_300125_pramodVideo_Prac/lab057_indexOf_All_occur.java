package ex_300125_pramodVideo_Prac;

public class lab057_indexOf_All_occur {
    public static void main(String[] args) {
        String fruit = "Banana";
        int index = fruit.indexOf('a');
        while (index != -1){
            System.out.println(" 'a'  found at index: " +index);
            index = fruit.indexOf('a' ,index + 1);
        }
    }
}
