package ex_15_StringBuffer_Builder_String_Functions;

public class Lab147_Sbuilder {
    public static void main (String[]args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World"); // Appends text
        sb.reverse();
        System.out.println(sb);
    }
}
