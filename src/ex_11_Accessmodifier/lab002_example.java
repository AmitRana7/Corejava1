package ex_11_Accessmodifier;

public class lab002_example {
    public static void main(String[] args) {
  Animal obj = new Animal();
    obj.display();
    }
}
class Animal{
    protected String name = "Tiger";

    protected void display(){
        System.out.println("Protected name: " +name);
    }
}