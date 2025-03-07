package ex_11_AccessModifier.Criminal;

import ex_11_AccessModifier.Parent22;

public class lab001_subclass {
    public static void main(String[] args) {
    Child33 chd33 = new Child33();
    chd33.show();
    }
}
class Child33 extends Parent22{
    void show(){
        display();
        System.out.println("Hello Child");
    }
}