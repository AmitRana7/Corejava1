package ex_13_Abstration;

public class lab011_Example_11 {
    public static void main(String[] args) {
    Sumsung s1 = new Sumsung();
    s1.call();
    s1.message();
    }
}
interface Mobile{
    void call();
    default void message(){
        System.out.println("Default Message");
    }
}
class Sumsung implements Mobile{

    @Override
    public void call() {
        System.out.println("Calling to local variable ");

    }

    @Override
    public void message() {
        Mobile.super.message();
    }
}