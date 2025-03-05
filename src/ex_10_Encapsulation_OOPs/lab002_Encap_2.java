package ex_10_Encapsulation_OOPs;

public class lab002_Encap_2 {
    public static void main(String[] args) {
ICICIbank ic = new ICICIbank("Amit",100);
        System.out.println(ic.name);
        System.out.println(ic.balance);
        ic.setName("Preeti");
        System.out.println(ic.getName());
        boolean isCashier = true;
        ic.setBalance(2000, true);
        System.out.println(ic.getBalance());

    }
}
class ICICIbank{
    String name;
    long balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isCashier) {
        if (isCashier) {
            this.balance = balance;
        } else {
            System.out.println("Not allowed to update balance");
        }
    }
    public ICICIbank(String n, long bal) {
        this.name = n;
        this.balance = bal;
    }
}