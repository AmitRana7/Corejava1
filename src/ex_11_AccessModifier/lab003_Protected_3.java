package ex_11_AccessModifier;

public class lab003_Protected_3 {
    public static void main(String[] args) {
        Child chd = new Child();
        chd.show();
    }
}
class Parent{
    protected void greet(){
        System.out.println("Parent class");
    }
}
class Child extends Parent{
    void show(){
        greet();
    }
}