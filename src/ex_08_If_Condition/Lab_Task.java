package ex_08_If_Condition;

public class Lab_Task {
    public static void main (String[]args) {
        int a= 25,b = 25,c = 30;
        if (a==b & a==c)
        {
            System.out.println("the triangle is isosceles");
        }
        else if(a==b || a==c || b==c)
        {
            System.out.println("The triangle is Equilateral");
        }
        else
        {
            System.out.println("The triangle is Scalene");
        }

    }
}