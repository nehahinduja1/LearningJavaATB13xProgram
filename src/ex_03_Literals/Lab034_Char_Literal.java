package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main (String[] args) {
        char c1= 'A'; // A to Z, a-z, &$%!@#$()_+
        char c2 = 'B';
        char c3 = '@';
        char c4 = '$';
        char c5 = '9';
        char c6 = '(';
        char c7 = '_';

//        Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Neha");
        System.out.println("Neha"+new_line+"Hinduja"); //put hinduja in new line
        System.out.println("Neha"+tab_line+"Hinduja"); // gives space between neha hinduja
        System.out.println("Neha"+back_space+"Hinduja"); // deleted last word of neha
        System.out.println("Neha"+carriage_return+"Hinduja"); // deleted whole word NEHA

        System.out.println("Hi, This is a First line"+new_line+"This is second line \n THis is Third Line");

        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65

        char c11 = '\u1F60';     //laugh smiley
        System.out.println(c11);  // unicode char

    }
}
