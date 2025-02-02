package Code_crkr_270125;

public class lab017_Example_formatIdentifier {
    public static void main(String[] args) {
        String name = "Amit Rana";
        int age = 30;
        double price = 19.99;
        boolean isAvailable = true;

        System.out.printf("Name: %s\n", name);  // String (%s)
        System.out.printf("Age: %d years\n", age);  // Integer (%d)
        System.out.printf("Price: $%.2f\n", price);  // Float with 2 decimal places (%f)
        System.out.printf("Available: %b\n", isAvailable);  // Boolean (%
    }
}
