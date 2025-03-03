package ex_09_Inheritance;

public class lab001_Single_Inheritance {
    public static void main(String[] args) {
        //Father f1 = new Father();
        Son s1 = new Son();
        System.out.println("Father give Gold: " +s1.gold);// ----Son Access-----
        s1.bhk2();
        s1.bhk3();

        Son2 s2 = new Son2();
        s2.bhk4();

    }
}
