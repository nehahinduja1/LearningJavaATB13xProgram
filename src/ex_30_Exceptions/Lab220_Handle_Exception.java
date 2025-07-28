package ex_30_Exceptions;

public class Lab220_Handle_Exception {
    public static void main(String[] args) {
        int a= 0;
        try {
            a = 10/0; // unchecked except ArithmeticException: / by zero
        } catch (Exception e) {      // except is a class
            System.out.println("Divide by zero not allowed");
        }
        System.out.println(a);
    }
}

// checked - JVM
// JVM knows about it, During compilation- JVM is saying that
// there can be case when this file is not found.

// JVM knows that this may lead to file not found exception
// so it is telling to handle it.