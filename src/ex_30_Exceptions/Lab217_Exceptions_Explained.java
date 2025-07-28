package ex_30_Exceptions;

public class Lab217_Exceptions_Explained {
    public static void main(String[] args) {

//        Unchecked exception
        System.out.println("starting the program");

        String user = args[0];
        int a = Integer.parseInt(user);
        int output = 100/a;
        System.out.println(output);
        System.out.println("End of the program");

//        divide / by zero - java.lang.ArithmeticException: / by zero
//        String added in arguments - java.lang.NumberFormatException: For input string: "neha"
//        divide by blank exception - java.lang.ArrayIndexOutOfBoundsException

    }

}
