package ex_20_OOPs_Polymorphism.methodoverridding;

public class Lab189_MOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }
}


class Animal {
    void sound() {
        System.out.println("Default Sound!");
    }

//    void A() {
//    }
}
class Dog extends Animal {

    @Override  //Annotation is not compulsory but it is good practise to tag annotation
    void sound() {
        System.out.println("Bark!!");
    }

}