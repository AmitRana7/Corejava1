package ex_13_Abstration;

public class lab004_Interface_2 {
    public static void main(String[] args) {
    P p = new P();
    p.display();
    }
}
interface I1{
    void icm1();
    void icm2();

}
interface I2{
    void icm3();
}
class P implements I1 , I2{

    @Override
    public void icm1() {
        System.out.println("ICM1 Complete");

    }

    @Override
    public void icm2() {
        System.out.println("ICM2 Complete ");

    }

    @Override
    public void icm3() {
        System.out.println("ICM2 Complete");

    }
    void display(){
        icm1();
        icm2();
        icm3();

    }

}
