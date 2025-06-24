import java.util.Scanner;
package ex_14_Strings;

public class InterviewCoding {
    public static void main(String[] args) {
        // Palindrome
        // madam -> reverse(madam) -> madam ==
        // s1 = madam
        // s1_reverse = madam
        // s1 == s1_reverse
        // G

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.next();
        // String newString_reversed = reverseStringSB(input);
        String newString_reversed = reverseString(input);

        if (newString_reversed.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Non palindrome");
        }
        // madam.charAt(1) -> a
    }

    Static String reverseString(String userInput) {
        String reversed = "";
        for (int i = userInput.Length )
    }




    private static String reverseString(String input) {
    }
}
