package ex_30_Exceptions;

public class Lab226_IQ2 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = 10/c;  // Vulnerable code that should be try and catch
        } catch(ArithmeticException e) {   // if dont know which exception it is use catch (exception e) again
            System.out.println(e.getMessage());   // it will run one catch
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
