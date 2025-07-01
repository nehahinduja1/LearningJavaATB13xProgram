package ex_18_OOPs_Constructor;

public class Task2_Parameterized_Constructor {
    public static void main(String[] args) {
        // Create objects using the parameterized constructor
        Employee e1 = new Employee("Neha", 101);
        Employee e2 = new Employee("Nikhil", 102);
    }
}

class Employee{
    String name;
    int id;

    // Parameterized Constructor
    Employee(String empName, int empID) {
        this.name = empName;
        this.id = empID;
        System.out.println("Employee Name -> " + name);
        System.out.println("Employee ID -> " + id);
    }
}

