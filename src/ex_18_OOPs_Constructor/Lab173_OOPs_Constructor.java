package ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {

 public static void main(String[] args) {
  Baby b1 = new Baby();
 }


}

 class Baby {
  //        attribute instance variable, member variable, data members.
  String name;

  // Default Constructor!
 Baby() {
  System.out.println("I am default constructor!");
  System.out.println("Your Aadhar Number is ready!");

//Fetch data from the MySQL database...
  //Read from CSV file to XLSX
  // Open a file and read the data. (json, testdata.xlsx, txt file)

 }
void m1() {
 System.out.println("Hi m1");

}


 // Behaviour
 void cry() {
  System.out.println("Cry!!");
 }

 void sleep(){
  System.out.println("Sleep");
 }

 void eat() {
  System.out.println("Eat!!");
 }

}