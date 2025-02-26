package ex_08_Oops_Constructer;

public class lab009_constructor8 {
    public static void main(String[] args) {
        Professor tech = new Professor();
        tech.name = "Veer Rana";
        tech.age =30;

        Professor tech2 = new Professor(tech);

        tech2.ProfessorInfo();
    }
}
class Professor {
    String name;
    int age;

    void ProfessorInfo(){
        System.out.println("Professor Information: ");
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Professor(Professor tech2){
        this.name = tech2.name;
        this.age = tech2.age;

    }
   Professor(){

   }
}
