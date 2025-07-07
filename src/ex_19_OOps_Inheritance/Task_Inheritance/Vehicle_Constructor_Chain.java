package ex_19_OOps_Inheritance.Task_Inheritance;

public class Vehicle_Constructor_Chain {
    public static void main(String[] args) {
        Bike b1 = new Bike();

    }

}

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle {
    Bike() {
        System.out.println("Bike is ready");
    }
}