package ex_09_Inheritance;

public class lab002_Single_InheritanceEx2 {
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.eat();
        d1.bark();

    }
}
class Animal{
    void eat (){
        System.out.println("Animal eat the Grass");
    }
}
class Dogs extends Animal{

    void bark(){
        System.out.println("Dogs are Barking");
    }
}