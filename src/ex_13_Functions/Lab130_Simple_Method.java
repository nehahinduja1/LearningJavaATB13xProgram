package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        pramod_f1();
        return_int();
        return_boolean();
    }
       static void pramod_f1() {
            System.out.println("No Return");
//            this void does not return anything
        }

        static int return_int() {
           System.out.println("This is a normal function which return something");
           return 10;
    }

       static boolean return_boolean() {
           return true;
    }

    static float return_float_pi_value() {
          return 3.14f;
    }

    static String return_String() {
        return "Neha";
    }

    static long return_long() {
        return 10l;
    }
}
