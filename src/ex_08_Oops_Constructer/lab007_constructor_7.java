package ex_08_Oops_Constructer;

public class lab007_constructor_7 {
    public static void main(String[] args) {
      Pen pen1 = new Pen();
      pen1.color = "Blue";
      pen1.type = "Gel";
      pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint";
        pen2.write();
        pen2.printColor();


 }

    }

    class Pen{
    String color;
    String type;

    void write() {
        System.out.println("Write Something");
    }
        void printColor(){
            System.out.println(this.color);
            System.out.println(this.type);
        }

    }
