package ex_11_AccessModifier;

public class lab002_default_2 {
    public static void main(String[] args) {
    Test1 t2 = new Test1();
    t2.display();
    }
}
class Test1 {
    String message = "Default Message";

    void display(){
        System.out.println(message);
    }
}