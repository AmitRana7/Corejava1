package ex_10_Encapsulation_OOPs;

public class lab003_Encap_3 {
    public static void main(String[] args) {
    Person p1 = new Person("Amit", 22);
   // p1.name = "Preeti";
     //   System.out.println(p1.name);// not error here variable member is public.
     //   System.out.println(p1.age = 20);  Error bcoz of variable member is private
       // p1.setAge(35);
       // System.out.println(p1.getAge());
        p1.setName("Veer Rana");
        System.out.println(p1.getName());
        boolean isAge = true;
        p1.setAge(32,true);
        System.out.println(p1.getAge());
    }
}
class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, boolean isAge) {
        if (isAge) {
            this.age = age;
        } else {
            System.out.println("Not Change the age without Permission");
        }
    }

    public Person(String n, int a) {
        this.name = n;
        this.age = a;


    }
}