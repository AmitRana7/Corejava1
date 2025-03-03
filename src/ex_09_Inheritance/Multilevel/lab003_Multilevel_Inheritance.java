package ex_09_Inheritance.Multilevel;

public class lab003_Multilevel_Inheritance {
    public static void main(String[] args) {
       Puppy p1 = new Puppy();
       p1.weep();
       p1.eat();
       p1.bark();
    }
}
class Animal {
    void eat(){
        System.out.println("Animal Eat");
    }
}
class Dogs extends Animal{
    void bark(){
        System.out.println("Dogs bark");
    }
}
class Puppy extends Dogs{
    void weep(){
        System.out.println("Puppy weep");
    }
}