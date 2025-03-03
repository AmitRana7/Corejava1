package ex_09_Inheritance.Multilevel;

public class lab001_Multilevel_Inheritance {
    public static void main(String[] args) {
     Father f1 = new Father();
     Son s1 = new Son();
     s1.bhk4();
     s1.farm();
     f1.flat();
     f1.farm();
     f1.home();
    }
}

class GrandFather{
    void home(){
        System.out.println("GrandFather: Home----");
    }


    void farm(){
        System.out.println("Grand Father: Farm----");
    }
}

class Father extends GrandFather {
    void flat() {
        System.out.println("Father has: Flat-------");
    }
}
    class Son extends Father{
        void bhk4(){
            System.out.println("Son has bhk 4 Flat");

    }
}
