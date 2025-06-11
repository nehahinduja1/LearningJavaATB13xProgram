package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main (String[] args) {

        String first_name = "Neha";
        String last_name = "Hinduja";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a +b); // concatination continues
        System.out.println(a + b + first_name + last_name); // addition first
        System.out.println(first_name + last_name + (a+b));

//        BODMAS - Bracker of div, mult, add, sub
    }
}
