package ex_08_Oops_Constructer;

public class lab018_Constr_withAbstract {
    public static void main(String[] args) {
    Circle c1 = new Circle();
    }
}
abstract class Shape{
    Shape(){
        System.out.println("Shape Constructor called: ");
    }
}
class Circle extends Shape{
    Circle(){
        System.out.println("Circle Constructor called: ");
    }
}