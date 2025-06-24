package ex_14_Strings;

public class Lab_141_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s4 = "hello";  // SCP -> 1
        String s10 = "hello";

        String s2 = new String("hello"); // one string in object area
        String s3 = new String("hello"); // two
        String s5 = new String("Hello"); // three, OA = 3

//        == -> Comparsion -> String -> this check the location ref.
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

//        equals (content) -> values

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));  //(case sensitivity is ignored)

        // equalsIgnoreCase -> neha. Neha, NEHA, NeHa, NeHA -> neha
//        == -> check for the ref
//        = assignment the value
//        equals (content) - values

    }
}
