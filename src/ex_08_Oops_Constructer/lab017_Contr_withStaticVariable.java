package ex_08_Oops_Constructer;

public class lab017_Contr_withStaticVariable {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
class Counter{
    static int count = 0;

    Counter(){
        count++;
        System.out.println("Object Count: " +count);
    }
}
