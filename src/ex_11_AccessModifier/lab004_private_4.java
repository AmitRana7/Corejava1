package ex_11_AccessModifier;

public class lab004_private_4 {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.setName("Preeti");
        System.out.println(s1.getName());
    }
}
class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}