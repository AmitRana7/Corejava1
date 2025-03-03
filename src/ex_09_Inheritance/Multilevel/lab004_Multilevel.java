package ex_09_Inheritance.Multilevel;

public class lab004_Multilevel {
    public static void main(String[] args) {
        Bench b1 = new Bench();
        b1.benchInfo();
        b1.roomInfo();
        b1.schoolInfo();
    }
}
class School{
    void schoolInfo(){
        System.out.println("School Details");
    }
}
class Rooms extends School{
    void roomInfo(){
        System.out.println("Rooms Information");
    }
}
class Bench extends Rooms{
    void benchInfo(){
        System.out.println("Bench Details");
    }
}