package ex_09_Inheritance.Hierar;

public class lab002_herari2 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        c2.flat();
        c2.Plot2();
        c1.flat();
        c1.plot();

    }
}
class Parent{
    void flat(){
        System.out.println("Parent Have bhk3 Flat");
    }
}
class Child1 extends Parent{
    void plot(){
        System.out.println("Child have plot");
    }
}
class Child2 extends Parent{
    void Plot2(){
        System.out.println("Child2 Have Plot2");
    }
}