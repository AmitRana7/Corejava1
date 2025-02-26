package ex_08_Oops_Constructer;

public class lab015_Constr_callwithanocontr {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.display();
    }
}
class Rectangle{
 int length;
 int width;

 Rectangle(){
     this(5,10);
 }
 Rectangle(int l,int w){
     this.length = l;
     this.width = w;
 }
 void display(){
     System.out.println("Rectangle Area: ");
     System.out.println("Length: " +length);
     System.out.println("Width :" +width);
 }
}