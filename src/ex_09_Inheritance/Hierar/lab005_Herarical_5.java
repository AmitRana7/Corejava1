package ex_09_Inheritance.Hierar;

public class lab005_Herarical_5 {
    public static void main(String[] args) {
        Child9 c9 = new Child9();
        Child10 c10 = new Child10();


    }
}
class Parent9{
    Parent9(){
        System.out.println("This is Parent Class");
    }
}
class Child9 extends Parent9{
    Child9(){
        System.out.println("This is Child9");
    }
}
class Child10 extends Parent9{
    Child10(){
        System.out.println("This is Child10");
    }
}