package ex_30_Exceptions;

import java.util.Scanner;

public class Lab236_Throw {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            validateage(age);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    static void validateage(int age) throws Exception{
        if(age < 18) {
            throw new Exception("You are a minor, can't go to goa");

        }
    }
}
