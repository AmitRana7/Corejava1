package ex_08_Oops_Constructer;

public class lab006_Constructer6 {
    public static void main(String[] args) {
    Student s1 = new Student();
        System.out.println("Name: " +s1.name);
        System.out.println("Age: " +s1.age +"yrs old");

    s1.study();
    }
}
class Student {
    String name = "Veer Rana";
    int age = 2;

    void study(){
        System.out.println(name +" is studying");

    }
}