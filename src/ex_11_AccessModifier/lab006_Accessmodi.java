package ex_11_AccessModifier;

public class lab006_Accessmodi {
    public static void main(String[] args) {
    Car c1 = new Car();
    c1.display();
    }
}
class Vehicle{
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("Default Constructor");
    }
    Vehicle(int a){
        System.out.println("Param Constructor");
    }
    void message(){
        System.out.println("PC default");
    }
    void message(int a){
        System.out.println("Para ");
    }
    void display(){
        System.out.println("Display");
    }
}
class Car extends Vehicle{
    public int maxSpeed = 200;
    Car(){
        super(100);
        System.out.println("Child Cons");
    }
    Car(int a){
        System.out.println("Param car");
    }

    @Override
    void display() {
        super.display();
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);

    }
}
