package ex_12_SuperKeyword;

public class lab002_super_2 {
    public static void main(String[] args) {
        son1 s2 = new son1();
        s2.display();
    }
}
class Mother{
    int value = 10;
    void show(){
        System.out.println("Parent Class Method");
    }
}
class son1 extends Mother{
    void display(){
        super.show();

        System.out.println("Son Class Method");
        System.out.println(super.value);

    }
}