package ex_13_Abstration;

public class lab008_Example_8 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.run();
    }
}
abstract class Vehicle{
    Vehicle(){
        System.out.println("Vehicle Construtor");
    }
    abstract void run();

}
class Car1 extends Vehicle{

    @Override
    void run() {
        System.out.println("Car Run ");
    }
}