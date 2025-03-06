package ex_12_SuperKeyword;

public class lab008_super_8 {
    public static void main(String[] args) {
    child8 c8 = new child8();
    c8.show();
    }
}
class Father3{
    void show(){
        System.out.println("Parent class Method called");
    }

}
class child8 extends Father3{
    void show(){
        for (int i = 1; i <=4 ; i++) {
            super.show();
        }

    }
}