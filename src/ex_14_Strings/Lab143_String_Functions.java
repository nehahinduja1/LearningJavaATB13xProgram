package ex_14_Strings;

public class Lab143_String_Functions {
    public static void main (String[] args) {
        String name = "Sonal";
        System.out.println(name.length()); // 0,1,2,3,4
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(2));
// System.out.println(name..charAt(10)); // java.lang.StringIndexOutOfBoundsEx

        System.out.println(name.concat(" Patel"));

        // 3. contains()
        System.out.println(name.contains("om"));

        // 4. equals()
        System.out.println(name.equals("Sonal"));

        // 5. equalIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));

//        6. indexOf() //sonal -> o ?
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        // returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));
        System.out.println(s1.lastIndexOf("m")); // 0,1,2,3,4

//        7. length()
        System.out.println(name.length());

//        8. Replace(,) // sonal
        System.out.println(name.replace('n','t'));

//        9. split[]
        String name4 = "neha@hinduja29@gmail.com";
        String[] split_name4 = name4.split("@");  // without regex it can not be splitted
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

//        10. substring(), sonal
        System.out.println(name.substring(1,3));    // (3-1= 2) on

//        11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

//        12. toUpperCase()
        System.out.println("sonal".toUpperCase());

//        14. Startswith()
        System.out.println(name.startsWith("S"));  // true or false

//        15. Endswith()
        System.out.println(name.endsWith("a")); // true or false

        String anotherPalindrome = "Niagara. O roar again";
        System.out.println(anotherPalindrome.length());  // 0,1,2,3

//        Substring
        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);

//        Concatenation (BY +

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s222 + s333;
        System.out.println(result1);

        String n = "PRamoddUTTA";   // 0, 1, 2, 3, 4, 5
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));

    }
}
