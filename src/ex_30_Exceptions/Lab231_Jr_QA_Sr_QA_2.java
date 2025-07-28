package ex_30_Exceptions;

public class Lab231_Jr_QA_Sr_QA_2 {
    public static void main(String[] args) {


        // Sr QA
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100/a;
            System.out.println(b);
        } catch(NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
