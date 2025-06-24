package ex_14_Strings;

public class Lab_140_Interview_P1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s4 = "hello";  // only one string is present in string constant pool because hello is already created
        String s10 = "hello";

        String s2 = new String("hello"); // one string in object area
        String s3 = new String("hello"); // two
        String s5 = new String("Hello"); // three

        // SCP / OA
        // 1 / 3 -> 4
    }
}
