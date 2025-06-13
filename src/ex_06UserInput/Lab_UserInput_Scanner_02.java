package ex_06UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {

        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());

        System.out.println("Enter the Int");
        int int_input = scanner.nextInt();

        System.out.println("Enter the Double");
        double double_input = scanner.nextDouble();

    }
}
