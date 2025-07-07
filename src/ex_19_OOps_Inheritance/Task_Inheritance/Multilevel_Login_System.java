package ex_19_OOps_Inheritance.Task_Inheritance;

public class Multilevel_Login_System {
    public static void main(String[] args) {
        SuperAdmin s1 = new SuperAdmin();
        s1.shutdownSystem();
        s1.accessAdminPanel();
        s1.login();
    }
}

 class User {
    void login() {
        System.out.println("This is User");
    }
 }

 class AdminUser extends User {
    void accessAdminPanel() {
        System.out.println("This is Admin User");
    }
 }

 class SuperAdmin extends AdminUser {
    void shutdownSystem() {
        System.out.println("This is SuperAdmin Login");
    }
 }