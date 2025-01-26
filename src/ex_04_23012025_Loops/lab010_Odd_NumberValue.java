package ex_04_23012025_Loops;

public class lab010_Odd_NumberValue {
    public static void main(String[] args) {
        int n = 25;
        for (int i=1; i<=n; i++){
          if (i % 2 !=0){
              System.out.println(i);   // Print all Odd number till n.
          }
        }
    }
}
