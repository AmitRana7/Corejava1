package ex_11_AccessModifier.Criminal;

import ex_11_AccessModifier.Parent22;

public class Child22 extends Parent22 {
    public void show(){
        display();
        System.out.println("Child Class");
    }

}
    class Main{
    public static void main(String[] args) {
        Child22 chd22 = new Child22();
        chd22.show();
    }
}           //protected members can be accessed in a subclass in a different package.
