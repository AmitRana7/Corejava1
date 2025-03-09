package ex_13_Abstration;

public class lab007_Example_7 {
    public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.sound();
    d1.eat();
    }
}
abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Dog eat the food");
    }
}
class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Dog Bark");
    }

}