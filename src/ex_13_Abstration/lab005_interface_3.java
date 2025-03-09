package ex_13_Abstration;

public class lab005_interface_3 {
    public static void main(String[] args) {
    Child1 chd1 = new Child1();
    chd1.money();
    chd1.m1();
    chd1.f1();
    }
}
interface Father1{
    void money();
    void f1();
}
interface Mother1{
    void money();
    void m1();
   default void test(){
        System.out.println("Hello Java");
    }
}

class Child1 implements Father1,Mother1{

    @Override
    public void money() {
        System.out.println("Given Money");

    }

    @Override
    public void m1() {
        System.out.println("Mother Function");

    }

    @Override
    public void f1() {
        System.out.println("Father Function");

    }

}