package ex_09_Inheritance.Single_Inheritance;

public class lab002_Single_Inheritance {
    public static void main(String[] args) {
    child c2 = new child();
    c2.display();

    }
}
class Person {
    void display(){
        System.out.println("This is Parent Class");
    }

}
class child extends Person{
    @Override
    void display() {
        super.display();
        System.out.println("This is Child Class");
    }
}