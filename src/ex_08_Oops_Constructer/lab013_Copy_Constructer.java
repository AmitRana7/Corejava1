package ex_08_Oops_Constructer;

public class lab013_Copy_Constructer {
    public static void main(String[] args) {
    Boys b1 = new Boys("John",30,2000);
    Boys b2 = new Boys(b1);
    b1.display();
        System.out.println("Copy Boys Details: ");
        b2.display();
    }
}
class Boys{
    String name;
    int age;
    int salary;

    Boys(String n , int a ,int s) { //Parameterized Constructor
        this.name = n;
        this.age = a;
        this.salary = s;
    }
    Boys(Boys s){
        this.name = s.name;
        this.age = s.age;
        this.salary = s.salary;
        }

void display(){
            System.out.println("Boys Name: " +name);
            System.out.println("Boys Age: " +age);
            System.out.println("Boys Salary: " +salary);
        }
    }
