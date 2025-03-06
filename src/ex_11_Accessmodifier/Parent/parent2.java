package ex_11_Accessmodifier.Parent;

public class parent2 {
    protected String name = "class from parent";

    protected void display()
    {
        System.out.println(name);
    }
}
class child extends parent2{
    public void show(){
        display();
    }

}

    class Demo{
    public static void main(String[] args) {
        child ch = new child();
        ch.show();
    }

}