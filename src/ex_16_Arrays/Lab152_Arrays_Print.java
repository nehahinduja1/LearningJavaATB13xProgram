package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {
        int[] marks = { 51, 90, 19, 89, 90};
        System.out.println("  _ _ _ ");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            
        }

        Arrays.sort(marks);

        for(int i =0 ; i < marks.length; i++) {
            System.out.println(marks[i]);
        }


    }
}
