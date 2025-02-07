package ex_300125_pramodVideo_Prac;

public class lab058_indexOf_allOccur2 {
    public static void main(String[] args) {
        String fruit = "Banana";
        int index = fruit.indexOf('n');
        while (index != -1){
            System.out.println(" 'n' found at index: "  +index);
            index = fruit.indexOf('n' , index + 1);
        }
    }
}
