package ex_09_Inheritance;

public class lab001_SingleInheritanceEx1 {
    public static void main(String[] args) {
       Child obj = new Child();
       obj.nameTake();
    }
}
 class Parent{
    String name = "John";
    // Called Parent Class defined
 }
class Child extends Parent{
    void nameTake(){
        System.out.println("Name: " +name);
    }
}
