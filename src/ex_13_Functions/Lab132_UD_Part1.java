package ex_13_Functions;

public class Lab132_UD_Part1 {
//  User defined functions

//    1. Without Parameters and without return type
//    2. Without Parameters but with return type
//    3. With Parameters and without return type
//    4. With Parameters and with return type

    public static void main(String[] args) {
//        1. Without Arguments/ Parameters and without return type
wp_wr_greet();

//   2. Without Parameters but with return type
String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

//   3. With Parameters and without return type;
        greet_with_details("Neha", 29, 900000l);

//    4. With Parameters and with return type
       int sum = sum_of_two_numbers(3,4);
        System.out.println(sum);

    }
//    1. Without Parameters and without return type (declare)/ define
    static void wp_wr_greet() {
        System.out.println("-- Type 1: Without Parameters and without return type --");
        System.out.println("Hi, How are you?");
    }

//   2. Without Parameters but with return type
    static String greet_with_hello_wp_with_RT() {
        System.out.println("-- Type 2: Without Parameters but with return type --");
        System.out.println("wp_with_RT");
        return "Hi, How r you ?";
    }

    //    3. With Parameters and without return type (90% used)
    static void greet_with_details(String name,int age, long salary){
        System.out.println("-- Type 3: With Parameters and without return type --");
        System.out.println("Your name is -> " + name + "\nYour age is -> " + age + "\nYour salary is -> " + salary);
    }

//    4. With Parameters and with return type
        static int sum_of_two_numbers(int a,int b) {
            System.out.println("-- Type 4: With Parameters and with return type -- ");
        return a+b;


}
}
