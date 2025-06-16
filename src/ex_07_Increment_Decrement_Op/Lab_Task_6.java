package ex_07_Increment_Decrement_Op;

public class Lab_Task_6 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x + x++ + ++x;
        System.out.println("x=" + x +", y=" +y);

//        x= 5
//       x ++ = x = 5, then x = 6 use 5
//        ++x = x =6, then x = 7 use 7
//        x++ = x = 7,then x = 8 use 7
//        ++x = x = 8, then x = 9 use 9 = x = 9 = 5+7+7+9 = 28 = y
}

}

