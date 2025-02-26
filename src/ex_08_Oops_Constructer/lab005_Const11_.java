package ex_08_Oops_Constructer;

public class lab005_Const11_ {
    public static void main(String[] args) {
    Car c1 = new Car();
    c1.display();
    }
}
class Car{
    String Name = "Toyata";
    int speed = 120;

    void display(){
        System.out.println("Brand: " +Name);
        System.out.println("speed: " +speed);
    }
}