import models.User;

import java.util.Scanner;

class Student1{
    // Data Members of Student class
    private int studentId;
    private String studentName;
    private int studentAge;
    Scanner sc = new Scanner(System.in);

    // Member Function of Student Class
    public void acceptDetails(){
        System.out.println("Enter User Name : ");
        studentName = sc.nextLine();
        System.out.println("Enter Student ID : ");
        studentId = sc.nextInt();
        System.out.println("Enter Student Age : ");
        studentAge = sc.nextInt();
    }
    public void displayDetails(){
        System.out.println("Student ID : "+studentId);
        System.out.println("Student Name : "+studentName);
        System.out.println("Student Age : "+studentAge);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        // A process of wrapping code and data together into a single unit
        // Prevents outer classes from accessing and changing methods of a class
         Student1 student1 = new Student1();
         student1.acceptDetails();;
        // we use access modifiers to achieve encapsulation
        // -default (only within the package)
        // -public (Accessible everywhere)
        // -private(only within the class)
        // -protected( Accessible within and outside the package through inheritance
        User user = new User();
        System.out.println(user.name);
        System.out.println(user.age);
    }
}
