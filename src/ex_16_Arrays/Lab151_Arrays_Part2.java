package ex_16_Arrays;

public class Lab151_Arrays_Part2 {
    public static void main (String[]args) {
        String[] names = {"pramod", "neha", "nikhil"};
        System.out.println(names.length);   // one dimensional array
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;
        System.out.println(is_male_data[1]);

    }
}
