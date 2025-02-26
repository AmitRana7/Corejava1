package ex_08_Oops_Constructer;

public class lab012_Constructor_Overloading {
    public static void main(String[] args) {
    Employee e1 = new Employee();
        Employee e2 = new Employee("Alice",1000,30);

        System.out.println("By Default Details of Employee:  ");
    e1.employeeInfo();

        System.out.println("Parameterized Details of Employee: ");
    e2.employeeInfo();
    }
}
class Employee{
    String name;
    int salary;
    int age;

    Employee(){
        name = "Unknown";
        salary = 0000;
        age = 18;
    }
    Employee(String n, int a,int s) {
        this.name = n;
        this.salary = s;
       this.age = a;
    }

        void employeeInfo(){
            System.out.println("Employee Name: " +name);
            System.out.println("Employee Salary: " +salary);
            System.out.println("Employee age: " +age);
        }

    }
