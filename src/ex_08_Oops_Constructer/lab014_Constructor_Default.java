package ex_08_Oops_Constructer;

public class lab014_Constructor_Default {
    public static void main(String[] args) {
    Laptop l1 = new Laptop();
    //l1.brand = "Dell";
    //l1.price = 50000;
    l1.display();
    }
}
class Laptop{
    String brand;
    int price;
                                    // We have both Option we can define value of
                                    // integer in main function as well as in Default Constructor.
    Laptop(){
    brand = "Dell";
    price = 50000;
    }
    void display(){
        System.out.println("Display the laptop: ");
        System.out.println("Brand Name: " +brand);
        System.out.println("Price: " +price);
    }
}