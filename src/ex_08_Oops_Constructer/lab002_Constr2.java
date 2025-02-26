package ex_08_Oops_Constructer;

public class lab002_Constr2 {
    public static void main(String[] args) {
        Baby b1 = new Baby();
    }
}

class Baby{
    String name;
    int year;

    Baby(){
        System.out.println("This is Calling You");
    }
}