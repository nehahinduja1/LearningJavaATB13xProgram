package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab184_MultiL_LEVEL {
    public static void main (String[]args) {

//        Son S1 = new Father();
//        Son S1 = new GrandFather();
        Son amit = new Son();
        System.out.println(amit.gold_gf);
        amit.gf();

        GrandFather grandFather = new Son();
        grandFather.home();


    }
}
