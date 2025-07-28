package ex_30_Exceptions;

public class Lab219_String_NullPointer {
    public static void main (String[]args) {
        String name = null; // NullPointerException: Cannot invoke "String.trim()" because "name" is null
        name.trim();

    }
}
