package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        // find the max element within array

        int[] n = {25, 16, 14, 87, 94, 68, 75, 48};  // 0 to 7
        Arrays.sort(n);  // ascending to descending // 25, 16, 14, 87, 94, 68, 75, 48 = 8-1 = 7
//       Print 7th value i.e 94
//      System.out.println(number[number.length - 1]);
//        System.out.println(number[7]);

        int max_number = number(n);
        int min_number = number1(n);
        System.out.println(max_number);
        System.out.println(min_number);

    }

    static int number(int[] n) {
        int max = n[0];
        // logic

        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        return max;

    }

    static int number1 (int[] n) {
        int min = n[0];
        // logic

        for (int i = 0; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }
        return min;

    }



}
