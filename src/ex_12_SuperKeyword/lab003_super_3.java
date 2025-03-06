package ex_12_SuperKeyword;

public class lab003_super_3 {
    public static void main(String[] args) {
    Son s1 = new Son();
    }
}
class Mother1{
    Mother1(){
        System.out.println("Mother class Constructor");
    }
}
class Son extends Mother1{
    Son(){
        super();
        System.out.println("Son Class Constructor");
    }
}