package ex_12_SuperKeyword;

public class lab005_super_5 {
    public static void main(String[] args) {
        son5 s5 = new son5();
        s5.display();
    }
}
class Mother2{
    void display(){
        System.out.println("Calling Parent class ");
    }
}
class son5 extends Mother2{
    void display(){
        super.display();
        System.out.println("Calling Child class");
    }
}