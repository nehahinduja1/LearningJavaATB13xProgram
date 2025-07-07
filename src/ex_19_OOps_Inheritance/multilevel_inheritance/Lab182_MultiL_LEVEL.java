package ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab182_MultiL_LEVEL {
    public static void main (String[]args) {
        GrandFather gf = new GrandFather();
        gf.gf();
        System.out.println(" -- ");

        Father f1 = new Father();
        f1.f();
        f1.gf();

        System.out.println(" -- ");

        Son s = new Son();
        s.s();
        s.f();
        s.gf();

    }
}
