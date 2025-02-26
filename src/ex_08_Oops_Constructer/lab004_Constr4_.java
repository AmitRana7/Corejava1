package ex_08_Oops_Constructer;

public class lab004_Constr4_ {
    public static void main(String[] args) {
        car2 tesla = new car2("Tesla22",2020);
        System.out.println(tesla.model);
        System.out.println(tesla.year);


        System.out.println("------------------>");

        car2 nano = new car2("nano tata",2022);
        System.out.println(nano.model);
        System.out.println(nano.year);

    }
}
