package ex_13_Functions;

import java.util.Scanner;

/**
 * This class provides basic arithmetic operations.
 */
public class Lab134_Function_Arth {
    public static void main(String[] args) {
// create a function of sub, sum, Mul, Div
//        With parameter a,b (take the parameter from the User)

//        Logic Building
//        Step 1 -> Inputs and Outputs
//        a,b - int -> Scanner
//        int -> variable result ->

//        Step 2 - Rough logic -> Create functions
//        function -> type 4th - with return and with argumetns/parameters

//        step 3 - write the code and find and fix -> Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int a = 0;
        if(scanner.hasNextInt()) {
            a = scanner.nextInt();

        } else {
            System.out.println("Enter the int only");
            return;
//       System.exit(0);   in place of return
        }

        System.out.println("Enter the num 2");
        int b = 0;
        if(scanner.hasNextInt()) {
            b = scanner.nextInt();

        } else {
            System.out.println("Enter the int only");
            return;
//       System.exit(0);   in place of return
        }

        int result_sum = sum(a, b);
        System.out.println(result_sum);

        int result_sub = sub(a,b);
        System.out.println(result_sub);

        int result_div = div(a,b);
        System.out.println(result_div);

        int result_mod = mod(a,b);
        System.out.println(result_mod);

    }

    /**
     * Add two integers
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
   static int sum(int a, int b) {
        return a + b;
   }

    /**
     * Subtracts the second integer from the first integer
     * @param a the first integer
     * @param b the second integer
     * @return the difference of a and b
     */
   static int sub(int a, int b) {
       return a - b ;
   }

    /**
     * Division the first integer by the Second.
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a and b
     */

    static int div(int a, int b) {
        return a / b ;
    }

// Mod
    static int mod(int a, int b) {
        return a % b ;
    }
}
