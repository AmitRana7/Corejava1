package ex_13_Abstration;

public class lab014_Example_14 {
    public static void main(String[] args) {
        creditCard c1 = new creditCard();
        c1.makePayment();
        c1.paymentStatus();
    }
}
abstract class Payment{
    abstract void makePayment();

    void paymentStatus(){
        System.out.println("Payment is in Progress...");
    }
}
class creditCard extends Payment{

    @Override
    void makePayment() {
        System.out.println("Payment made by the Credit Card");
    }
}