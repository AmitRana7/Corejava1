package ex_09_Inheritance.Single_Inheritance;

public class lab003_Single_Inheritance {
    public static void main(String[] args) {
    Childs chd = new Childs();
    chd.showAge();
    }
}
class parent{
    private int age = 20;

    int getAge(){
        return age;
    }
}
class Childs extends parent{
    void showAge(){
        System.out.println("Age: "+getAge());
    }
}