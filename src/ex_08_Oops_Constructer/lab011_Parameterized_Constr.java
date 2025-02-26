package ex_08_Oops_Constructer;

public class lab011_Parameterized_Constr {
    public static void main(String[] args) {
    Person p1 = new Person("Sachin",30);
    p1.personInfo();

    }
}
class Person{
    String name;
    int age;

    Person(String n,int a){
        this.name = n;
        this.age = a;
    }
    void personInfo(){
        System.out.println("Person Name: " + name);
        System.out.println("Person Age: " +age);
    }

}