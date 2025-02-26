package ex_08_Oops_Constructer;

public class lab003_constr3 {
    public static void main(String[] args) {
        car tesla = new car();
        tesla.name = "Tesla Model 3";
        tesla.year = 2020;
        tesla.model = "TTTT";
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

    }
}
