package ex_08_Oops_Constructer;

public class car2 {
    String model;
    int year;


    car2() {
        model = "xxxx";  // Default Constructor
        year = 1990;
        System.out.println("Default Constructor");
    }
    car2(String model_name,int year_created){
        this.model = model_name;
        this.year = year_created;
    }
}
