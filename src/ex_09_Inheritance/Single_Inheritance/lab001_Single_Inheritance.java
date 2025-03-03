package ex_09_Inheritance.Single_Inheritance;

public class lab001_Single_Inheritance {
    public static void main(String[] args) {
    Child c1 = new Child();

    }
}
class Parent{
 Parent(){
     System.out.println("Parent Constructor");
 }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Constructor");
    }
}