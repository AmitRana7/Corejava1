package ex_10_Encapsulation_OOPs;

public class lab006_Encap_six {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla",2025);
        boolean isModel = true;
        c1.setModel(2026,true);
        System.out.println(c1.getModel());
        System.out.println(c1.getName());
    }
}
class Car{
    String name;
    int model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model , boolean isModel) {
        if (isModel){
        this.model = model;
    }else{
            System.out.println("Change model name only by Elon Musk");
        }
    }

    public Car(String n, int m) {
        this.name = n;
        this.model = m;
    }
}