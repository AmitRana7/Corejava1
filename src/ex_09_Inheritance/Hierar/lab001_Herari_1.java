package ex_09_Inheritance.Hierar;

public class lab001_Herari_1 {
    public static void main(String[] args) {
    Bike b1 = new Bike();
    Car c1 = new Car();
    b1.run();
    b1.start();
    c1.start();
    c1.honk();
    }
}
class Vehicle {
    void start(){
        System.out.println("Vehicle Start");
    }
}
class Car extends Vehicle{
    void honk(){
        System.out.println("Vehicle honk");
    }
}
class Bike extends Vehicle{
    void run(){
        System.out.println("Bike Run");
    }
}
