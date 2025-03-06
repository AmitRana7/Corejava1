package ex_12_SuperKeyword;

public class lab007_super_7 {
    public static void main(String[] args) {
        child7 c7 = new child7();
        c7.greet();
    }
}
class grandFather{
    void greet(){
        System.out.println("GrandFather class ");
    }
}
class parent extends grandFather{
    void greet(){
        super.greet();
        System.out.println("Parent class ");
    }
}
class child7 extends parent{
    void greet(){
        super.greet();
        System.out.println("Child class ");
    }
}