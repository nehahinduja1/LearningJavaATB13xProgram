package ex_18_OOPs_Constructor;

public class Task1_DefaultConstructor {
    public static void main (String[]args) {
        Student s1 = new Student();   //Calls default constructor

    }
}

class Student {
    String name;
    String school_name;
    int Class;

    //Default Constructor
    Student() {
        name = "Aarti";
        school_name = "Narayana";
        Class = 10;
        System.out.println(name);
        System.out.println(school_name);
        System.out.println(Class);
    }

}