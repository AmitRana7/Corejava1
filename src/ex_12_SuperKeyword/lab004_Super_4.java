package ex_12_SuperKeyword;

public class lab004_Super_4 {
    public static void main(String[] args) {
    childern child = new childern();

    }
}
class Mom{
    Mom(String msg){
        System.out.println("Parent Constructor: " +msg);
    }
}
class childern extends Mom{
    childern(){
        super("This is parent");
        System.out.println("Childern Construtor.");
    }
}