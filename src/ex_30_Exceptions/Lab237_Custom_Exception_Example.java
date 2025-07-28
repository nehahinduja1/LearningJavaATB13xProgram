package ex_30_Exceptions;

public class Lab237_Custom_Exception_Example {
    public static void main(String[] args) throws CurrenyMismatchCustomException{
        Bank sbi = new Bank(100,"INR");
        Bank icici = new Bank(123, "INR");
        int total = sbi.add(icici);
        System.out.println(total);

        Bank jp_chase = new Bank(101, "USD");
        int total_new = sbi.add(jp_chase);
        System.out.println(total_new);

    }
}
