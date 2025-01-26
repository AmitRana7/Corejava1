package ex_04_23012025_Loops;

public class lab009_Even_NumberValue {
    public static void main(String[] args) {
        int n = 50;
        for (int i=1; i<=n; i++){
            if ( i % 2 ==0 ){   // Print all even number till n..*
                System.out.println(i);
            }
        }
    }
}
