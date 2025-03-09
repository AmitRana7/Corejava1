package ex_13_Abstration;

public class lab015_Example_15 {
    public static void main(String[] args) {
    valuePrinter v1 = new valuePrinter();
    v1.displayValue();
    }
}
interface Constants{
    int Min_Value = 0;
    int Max_Value = 100;

    void displayValue();
}
class valuePrinter implements Constants{

    @Override
    public void displayValue() {
        System.out.println("Minimum Value: " + Min_Value);
        System.out.println("Maximum Value: " + Max_Value);
    }
}