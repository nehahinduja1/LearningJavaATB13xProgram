package ex_30_Exceptions;

public class Lab229_Jr_QA_Sr_QA {
    public static void main(String[] args) {
        String Input = null; // java.lang.ArrayIndexOutOfBoundsException
        try {
            Input = args[0];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        int a = 0;  //NumberFormatException
        try {
            a = Integer.parseInt(Input);
        } catch(NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        int b = 0; //ArithmeticException
        try {
            b = 100/a;
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
