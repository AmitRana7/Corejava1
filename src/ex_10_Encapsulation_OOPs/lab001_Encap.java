package ex_10_Encapsulation_OOPs;

public class lab001_Encap {
    public static void main(String[] args) {
        VWOlogin vwo = new VWOlogin("Amit Rana", "pass123");
        System.out.println(vwo.username);
        System.out.println(vwo.password);
        vwo.username = "Veer Rana";
        System.out.println(vwo.username);
        vwo.password = "345";
        System.out.println(vwo.password);

        VWOlogin1 vwo1 = new VWOlogin1("Preeti Rana","admin123");
        System.out.println(vwo1.getPassword());
        System.out.println(vwo1.getUsername());
        vwo1.setUsername("Darsh");
        System.out.println(vwo1.getUsername());
        //vwo1.setPassword("admin@456");
        //System.out.println(vwo1.getPassword());

        boolean isAdmin = true;
        vwo1.setPassword("password@123",true);
        System.out.println(vwo1.getPassword());


    }
}
class VWOlogin{
    String username;
    String password;

    public VWOlogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }
}
class VWOlogin1{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("NOt allowed only for admin");
        }
    }
    public VWOlogin1(String user, String pwd) {
        this.username = user;
        this.password = pwd;


    }
}