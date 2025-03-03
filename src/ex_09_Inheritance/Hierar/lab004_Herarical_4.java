package ex_09_Inheritance.Hierar;

public class lab004_Herarical_4 {
    public static void main(String[] args) {

        Parent6 p;
        p = new Child6();
        p.show();
        p = new Child7();
        p.show();
    }
}
class Parent6{
    void show(){
        System.out.println("This is parent method");
    }
}
class Child6 extends Parent6{
    void show(){
        System.out.println("This is Child6");
    }
}
class Child7 extends Parent6{
    void show(){
        System.out.println("This is Child7");
    }
}