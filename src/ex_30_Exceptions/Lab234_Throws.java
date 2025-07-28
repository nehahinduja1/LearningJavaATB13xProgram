package ex_30_Exceptions;

import java.io.FileInputStream;

public class Lab234_Throws {
    public static void main(String[] args) {

    }

    static void t()  throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
//        Instead of try catch block using throws securing full function
//        throws is added to functions and try catch is added to block of code
    }
}
