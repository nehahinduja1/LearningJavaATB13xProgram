package ex_30_Exceptions;

public class Lab235_throw {

    // throw if u want to explicitly give the exception use throw
    // try catch handle prog in block
    // throws handle method

    public static void main(String[] args) {

    }
    static void divideByZero( int a) {
        if (a==0) {
            throw new ArithmeticException("error a == 0");
        }
    }
}
