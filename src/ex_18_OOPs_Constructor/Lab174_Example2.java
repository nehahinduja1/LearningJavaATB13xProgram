package ex_18_OOPs_Constructor;

public class Lab174_Example2 {
    public static void main(String[] args) {
        WebAutomation w1 = new WebAutomation();
    }

}

class WebAutomation {
    // Default constructor
    WebAutomation() {
        System.out.println("I want to read a CSV file");
        System.out.println("Open the page before loading the scripts");
        System.out.println("You can do anything which you want to do, when Object is Created");
//        FileInputStream fileInputstream = new FileInputStream("C://a.txt");
    }
}