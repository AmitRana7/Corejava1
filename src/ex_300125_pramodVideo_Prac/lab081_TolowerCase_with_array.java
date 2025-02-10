package ex_300125_pramodVideo_Prac;

public class lab081_TolowerCase_with_array {
    public static void main(String[] args) {
        String[] names = {"ALINCE","JOHN","DOE"};

        for (int i=0; i< names.length; i++){
            names[i] = names[i].toLowerCase();
            System.out.println(names[i]);
        }
    }
}
