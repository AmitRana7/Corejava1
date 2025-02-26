package ex_08_Oops_Constructer;

public class lab019_Constr_Final {
    public static void main(String[] args) {
    Example obj = new Example(40);

    }
}
class Example{
     final int x;

    Example(int y){
        this.x = y;
        System.out.println("Constructor Called: " +x);
    }
}