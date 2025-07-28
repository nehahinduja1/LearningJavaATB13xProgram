package ex_30_Exceptions;

public class Lab222_Try_Catch_Multiple {
    public static void main (String[]args) {
        System.out.println("1");
        try{
            int a = 10/0;
        } catch(ArithmeticException e) {   // arithmetic is small basket
            System.out.println("Are you a fool");
        } catch( Exception e) {           // except is like a bigger basket
            System.out.println("Are you a fool too");
        }                              // First use smaller class then use bigger classes
        System.out.println("2");
    }
}
