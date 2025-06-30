package ex_17_OOPs;

public class Person {

    //These are called as properties, attributes, instance variables, member variables.
    String name;
    int age;
    String height;
    String gender;
    boolean is_married;


    //Behaviours,member functions, functions, methods.
    void walk(){
        System.out.println("Walking");
    }

    void eat() {
        System.out.println("Eating");
    }

    String sleep() {
            System.out.println("sleeping");
            return null;
        }

        String food(int a){
            System.out.println("Eating");
            return null;
        }
    }

