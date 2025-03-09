package ex_13_Abstration;

public class lab002_Example_2 {
    public static void main(String[] args) {
    Baleno bl = new Baleno();
    bl.drive();
    }
}
abstract class Engine{
    abstract void start();
    abstract void stop();
}
class Baleno extends Engine{

    @Override
    void start() {
        System.out.println("Start");

    }

    @Override
    void stop() {
        System.out.println("Stop");

    }
    void drive(){
        start();
        System.out.println("I am driving a Car");
        stop();
        System.out.println("\nThank you ");
    }
}