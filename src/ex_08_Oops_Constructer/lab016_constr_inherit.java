package ex_08_Oops_Constructer;

public class lab016_constr_inherit {
    public static void main(String[] args) {
    Dogs d1 = new Dogs();

    }
}
class Animal{
    Animal(){
        System.out.println("Animal Constructor");
    }
}
class Dogs extends Animal{
    Dogs(){
        System.out.println("Dogs Constructor");
    }
}
