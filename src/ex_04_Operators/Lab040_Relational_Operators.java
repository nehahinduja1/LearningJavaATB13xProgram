package ex_04_Operators;

public class Lab040_Relational_Operators {
    public static void main (String[] args) {
//        < Less than
//        < = -> Less than or equal to
//        > Greater
//        >= Greater or equal
//         == -> Equal to (but checking)
//        != -> Not equal

//         All of them will result boolean output.

         int a = 10;
         int b = 30;
         boolean c = a > b;
        System.out.println(c); // 10>30 wrong

        int age_mamitha = 33;
        int age_pramod = 34;
        boolean result = age_pramod >= age_mamitha;
        System.out.println(result);

//       age_pramod > age_mamitha or age_pramod = age_mamitha
    }
}
