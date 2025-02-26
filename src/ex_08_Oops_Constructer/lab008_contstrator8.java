package ex_08_Oops_Constructer;

public class lab008_contstrator8 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Veer Rana";
        t1.age = 30;
        t1.TeacherInfo();

    }
}
class Teacher{
    String name;
    int age;

    void TeacherInfo(){
        System.out.println("Enter the Teacher Information");
        System.out.println(this.name);
        System.out.println(this.age);

    }
    Teacher(){
        System.out.println("Constructor Called");
    }

    }


