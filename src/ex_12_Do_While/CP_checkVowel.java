package ex_12_Do_While;

import java.util.Scanner;

public class CP_checkVowel {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single alphabet:");
        char ch = scanner.next().toLowerCase().charAt(0);


        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("Consonants");


        }



    }
}
