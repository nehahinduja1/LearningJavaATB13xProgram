package ex_17_OOPs;

public class Lab167_OOps_P2 {
    public static void main (String[] args) {
        Student s1 = new Student();
        Student s2;   //This is not an object creation just a reference creation
        new Student();  // object creation without name
     //   s1.name = "Neha";
       // System.out.println(s1.name);
    }
}

class Student {
    String name;       //atrributes, data variable, instance variable, member variable


    //This is called the default constructor,Same as the class name.
    Student() {
        System.out.println("DC");
    }

    void sleep() {   //behaviour
        System.out.println("Hi");
    }
}
