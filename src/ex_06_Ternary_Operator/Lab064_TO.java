package ex_06_Ternary_Operator;

public class Lab064_TO {
    public static void main(String[] args) {
        // The max number between two numbers by suing ternary operator.
        int x = 10;
        int y = 20;
//        System.out.println(Math.max(x,y));
         int max = x > y ? x : y;
        System.out.println(max);


    }
}
