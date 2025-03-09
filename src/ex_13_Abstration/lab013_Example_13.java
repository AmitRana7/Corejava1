package ex_13_Abstration;

public class lab013_Example_13 {
    public static void main(String[] args) {
    Bird b1 = new Bird();
    b1.fly();
    b1.swim();
    }
}
interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Bird implements Flyable,Swimmable{

    @Override
    public void fly() {
        System.out.println("Bird Can Fly");
    }

    @Override
    public void swim() {
        System.out.println("Bird can Swim");
    }
}