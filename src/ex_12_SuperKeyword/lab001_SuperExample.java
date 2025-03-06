package ex_12_SuperKeyword;

public class lab001_SuperExample {
    public static void main(String[] args) {
    son s1 = new son();
    s1.t1();
    }
}
class Father{
    Father(){
        System.out.println("Default Constructor");
    }
    int gold = 10;
    void home(){
        System.out.println("Father Home");
    }
}
class son extends Father{
        son(){
            super();
        }
    void t1(){
        super.home();
        System.out.println(super.gold);
    }

}