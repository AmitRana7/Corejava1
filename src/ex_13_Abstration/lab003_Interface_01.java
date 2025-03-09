package ex_13_Abstration;

public class lab003_Interface_01 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.drive();
    }
}
interface Engine1{
    void startEngine();
    void stopEngine();
    default void Test(){
        System.out.println("This is complete function");
    }
}

interface Brakes{
    void applyBrake();
}
class Car implements Engine1, Brakes{

    @Override
    public void startEngine() {
        System.out.println("Start");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop");

    }

    @Override
    public void applyBrake() {
        System.out.println("Brake");

    }
    void drive(){
        startEngine();
        System.out.println("I am drive the car");
        applyBrake();
        Test();
}
}