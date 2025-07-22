package ex_15_StringBuffer_Builder_String_Functions;

public class Interview_Vowels {
    public static void main(String[] args) {
        // Java prog to count vowels and consonants
//        pramod -> a,i,e,o,u -> v - 2, c - 4

     String input = "Java program to count vowels and consonants";
     int vowels = 0;
     int consonants = 0;

     input = input.toLowerCase();
        System.out.println(input);  // for Loop

        for(int i =0; i<input.length(); i++) {
            char c = input.charAt(i);
//   input is a String (a sequence of characters).
// .charAt(i) is a method that returns the character at index i in the string.input.charAt(0), input.charAt(1)
//  || OR
            if(c == 'a' || c == 'i' || c == 'e' || c =='o' || c =='u' ) {
                vowels++;
            }
            else {
                consonants++;
            }
        }
        System.out.println("Number of vowels:" + vowels);
        System.out.println("Number of consonants:" + consonants);
    }
}
