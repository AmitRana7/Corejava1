package ex_13_Abstration;

public class lab006_Example {
    public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.draw();
    Rectangle r1 = new Rectangle();
    r1.draw();
    }
}

abstract class Shape{
   abstract void draw();
    }

class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Circle Shape");
    }
}
class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Rectangle Shape");
    }
}