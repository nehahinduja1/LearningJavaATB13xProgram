package ex_07_Increment_Decrement_Op;

public class Lab_Task_2 {
    public static void main (String[]args) {
        int i = 1;
        i = i++ + ++i;
        System.out.println(i);//?
//        i = 1
//        then i++ = i+1= 2, so i = 2,
//        ++i = ++2 = 3
//        1 + 3 = 4
    }
}
