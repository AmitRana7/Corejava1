package ex_10_Encapsulation_OOPs;

public class lab005_encap_5 {
    public static void main(String[] args) {
    Student s1 = new Student("Amit",25);
    //s1.name = "Preeti";
      //  System.out.println(s1.name);    only used with public variable otherwise give the error.
        s1.setName("Veer Rana");
        System.out.println(s1.getName());
        boolean isRoll = true;
        s1.setRollNumber(33,true);
        System.out.println(s1.getRollNumber());
    }
}
class Student{
    private String name;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber,boolean isRoll ) {
        if (isRoll) {
            this.rollNumber = rollNumber;
        } else {
            System.out.println("Roll Number only change class Teacher");
        }
    }

    public Student(String n, int r) {
        this.name = n;
        this.rollNumber = r;


    }
}