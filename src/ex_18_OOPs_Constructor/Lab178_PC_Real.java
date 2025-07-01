package ex_18_OOPs_Constructor;

public class Lab178_PC_Real {
    public static void main(String[] args) {
        Person p1 = new Person("Amit", 987654321,"abc");
        Person p2 = new Person("Neha", 989898989, "xyz");
        System.out.println(p1.name);
        System.out.println(p2.name);

//        Person p3 = new Person();
//        p3.name = "Smita";   // this is late
//        System.out.println(p3.name);
    }
}


class Person {

    String name;
    long phone;
    String address;

    Person() {

    }

    Person(String name_user) {
        this.name = name_user;

    }

    Person(String name_user, long phone_user, String address_user) {
       this.name = name_user;
       this.address = address_user;
       this.phone = phone_user;
    }

    Person(String name_user, long phone_user) {
        this.name = name_user;
        this.phone = phone_user;
    }

}