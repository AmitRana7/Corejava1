package ex_13_Abstration;

public class lab009_Example_9 {
    public static void main(String[] args) {
    SBI sbi = new SBI();
    HDFC hdfc = new HDFC();
    sbi.bankName();
    sbi.loanInterestRate();
    hdfc.bankName();
    hdfc.loanInterestRate();
    }
}
abstract class Bank{
    abstract void loanInterestRate();

    void bankName(){
        System.out.println("Welcome to xyz bank");
    }
}
class SBI extends Bank{

    @Override
    void loanInterestRate() {
        System.out.println("Welcome to SBI Bank");
    }
}
class HDFC extends Bank{

    @Override
    void loanInterestRate() {
        System.out.println("Welcome to HDFC Bank");
    }
}