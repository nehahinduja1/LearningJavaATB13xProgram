package ex_10_For_Loop;

public class Lab113_For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) { //0 to 50, 51 times
            if (i %2 ==0) {
                continue;  //skipping the condition
            }
            System.out.println("odd -> " + i);
        }
    }
}
