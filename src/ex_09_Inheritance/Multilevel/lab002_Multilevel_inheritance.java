package ex_09_Inheritance.Multilevel;

public class lab002_Multilevel_inheritance {
    public static void main(String[] args) {
    Child c4 = new Child();
    c4.info();
    }
}
class GrandParent{
    String nameGrand = "John";
}
class Parent extends GrandParent{
    String name = "Alice";
}
class Child extends Parent{
    void info(){
        System.out.println("Name of GrandParent: " + nameGrand);
        System.out.println("Name of Parent: " + name);
    }
}