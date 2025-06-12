package ex_05_TypeCasting;

public class Lab059_TypeCasting {
    public static void main(String[] args) {
        long phone = 9876543210l;
//        short s = phone_no; // Implicit Narrow ?
        short s1 = (short)phone; //Explicit Narrow ?
        System.out.println(phone);
    }
}
