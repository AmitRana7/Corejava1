package ex_13_Abstration;

public class lab010_Example_10 {
    public static void main(String[] args) {
    Document d1 = new Document();
    d1.print();
    }
}
interface Printable{
    void print();
}
class Document implements Printable{

    @Override
    public void print() {
        System.out.println("Print Documents");

    }
}