package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main (String[] args) {
        int val = 300;
//        byte b = val; //Narrowing(int -> byte) Implicit casting is not allowed.
        byte b1 = (byte)val; //Narrowing (int -> byte) - Explicit Casting is allowed
        // data loss
        System.out.println(b1);

        // int= 32bits
//        byte = 8 bits
//        0+0+1+0+1+1+0+0
//        0+0+32+0+8+4+0+0  = 44
    }
}
