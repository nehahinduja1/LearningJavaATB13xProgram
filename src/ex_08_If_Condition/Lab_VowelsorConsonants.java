package ex_08_If_Condition;

import java.util.Scanner;
public class Lab_VowelsorConsonants {
        public static void main(String[] args) {

            //  ## To check if a character is a vowel in Java
            // ch == aeiou

            //  - User will enter a character.
            //  - You will check by using if-else loop and give that if the character is a vowel or a consonant.

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Single character");
            char ch = scanner.next().toLowerCase().charAt(0);
            if (ch == 'a' ||ch == 'e' || ch== 'o' || ch=='i'|| ch=='u')
            {
                System.out.println(ch + "is a vowel");
            } else if(ch >= 'a' && ch<= 'z'){
                System.out.println(ch +  "is a consonant");
            }
            else {
                System.out.println("Invalid char!");
            }





        }
    }


