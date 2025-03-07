package ex_11_AccessModifier;

public class lab001_private_1 {
    public static void main(String[] args) {
    Test t1 = new Test();
    //t1.display(); display() has private access in ex_11_AccessModifier.Test
    t1.show();
    }
}
class Test{
    private String message = "Private Message";
    private void display(){
        System.out.println(message);
    }
    public void show(){
        display();

    }              // Explanation: The display() method is private, so it cannot be accessed outside Test
                    // but can be used within the class.



}
