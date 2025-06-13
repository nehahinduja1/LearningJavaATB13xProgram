package ex_06UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_01 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");

        int age = scanner.nextInt();
        String canIvote = age >= 18 ? "Yes" : "No";
        System.out.println(canIvote);

    }
}
