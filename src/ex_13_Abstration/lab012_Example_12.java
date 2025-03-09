package ex_13_Abstration;

public class lab012_Example_12 {
    public static void main(String[] args) {
    Laptop l1 = new Laptop();
    l1.run();
    l1.Start();
    }
}
abstract class Computer{
    final void Start(){
        System.out.println("Final Method of Class");
    }
    abstract void run();
}
class Laptop extends Computer{

    @Override
    void run() {
        System.out.println("Laptop is working");
    }
}