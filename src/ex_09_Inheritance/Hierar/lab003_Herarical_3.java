package ex_09_Inheritance.Hierar;

public class lab003_Herarical_3 {
    public static void main(String[] args) {
    Child4 c1 = new Child4();
    Child5 c2 = new Child5();
    c1.show();
    c2.show();
    }
}
class Parent1{
    void display(){
        System.out.println("This is parent method Class");
    }
}
class Child4 extends Parent1{
    void show(){
        super.display();
        System.out.println("This is Child1");
    }
}
class Child5 extends Parent1{
void show(){
    super.display();
    System.out.println("This is Child2");
}
}