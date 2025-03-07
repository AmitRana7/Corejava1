package ex_11_AccessModifier;

public class lab005_PrivatevsPublic {
    public static void main(String[] args) {
    Example e1 = new Example();
    e1.publicMethod();
    }
}
class Example{
    private void privateMethod(){
        System.out.println("Private Method is defined ");
    }

    public void publicMethod(){
        privateMethod();
        System.out.println("Public Method is defined  ");
    }

}