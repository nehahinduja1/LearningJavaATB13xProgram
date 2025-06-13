package ex_08_If_Condition;

import java.util.Scanner;

public class Lab080_If {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner neha = new Scanner(System.in);
        int age = neha.nextInt();

        if(age > 18){
            System.out.println("Allowed to Vote!");
        }
    }
}
