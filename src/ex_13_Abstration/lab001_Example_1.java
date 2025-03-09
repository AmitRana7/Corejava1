package ex_13_Abstration;

public class lab001_Example_1 {
    public static void main(String[] args) {
        Child chd = new Child();
        chd.loan50k();
        chd.loan25k();
    }
}
abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("Given 25k");
    }
}
class Child extends Father{

    @Override
    void loan50k() {
        System.out.println("Child give the loan of father");
    }
}

