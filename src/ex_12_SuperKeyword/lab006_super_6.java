package ex_12_SuperKeyword;

public class lab006_super_6 {
    public static void main(String[] args) {
    child chd = new child();
    chd.show();
    }
}
class Parent{
    void message(){
        System.out.println("Message from Parent");
    }
}
class child extends Parent{
    void message(){
        System.out.println("Message from Child");
    }

    void show(){
        super.message();
        message();
    }
}
