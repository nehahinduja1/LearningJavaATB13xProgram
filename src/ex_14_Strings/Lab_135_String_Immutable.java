package ex_14_Strings;

public class Lab_135_String_Immutable {
    public static void main (String[]args) {
        String name = "Neha";  //  string is created inside String control pool,
      //  name.toUpperCase();   // Another string is created NEHA
        name = name.toUpperCase(); // Reassigning the string
        System.out.println(name);  // Neha

    }



}
