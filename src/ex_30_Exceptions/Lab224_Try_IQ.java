package ex_30_Exceptions;

public class Lab224_Try_IQ {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();      // It will stop here only so use try catch to handle exception
            int a = 10/0;    // It does not look good one another try catch twice so it can be combined using OR
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null or Arth Error");
        } catch (Exception e) {
            System.out.println("Yes");
        }
        System.out.println("end");
    }
}
