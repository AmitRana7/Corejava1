package ex_11_Accessmodifier.Police;

public class cop {
    int gun;
    String iCard;

    public cop(int gun) {
        this.gun = gun;
    }

   public void canIshoot(){
        System.out.println("Yes,You can shoot");
    }
}
