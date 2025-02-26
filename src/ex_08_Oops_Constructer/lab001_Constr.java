package ex_08_Oops_Constructer;

public class lab001_Constr {
    public static void main(String[] args) {
    A a1 = new A();
        System.out.println(a1);
    }
}

class A{
    A(){
        System.out.println("DC");
    }
}