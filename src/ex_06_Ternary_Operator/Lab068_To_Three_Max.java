package ex_06_Ternary_Operator;

import java.sql.SQLOutput;

public class Lab068_To_Three_Max {
    public static void main (String[] args) {
//        Find the maximum between the three numbers.
//        Logic building formula

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

//        Step 1 : Find inputs / Outputs
//        I/O -> n1, n2, n3 - int
//        O/P -> String -> max number

//       Step 2 - Rough Logic, think about it
//        n1 > n2 and n1 > n3 -> n1
//        n2 > n3 and n2 > n1 -> n2
//        n3

//        Step 3
//        int max = (n1 > n2) ? : A: B
        int max = (n1 > n2)? (n1 > n3) ?  n1 : n3 : (n2 > n3)?  n2 : n3;
//        A -> (n1 > n3) ? : n1 : n3
//        b -> (n2 > n3) ? : n2 : n3
        System.out.println(max);

    }
}
