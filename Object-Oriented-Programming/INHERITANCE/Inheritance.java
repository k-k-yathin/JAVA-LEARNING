import java.util.Scanner;

class Student3 {
    // Data Members of Student class
    int studentId;
    String studentName;
    int studentAge;
    Scanner sc = new Scanner(System.in);

    // Member Function of Student Class
    public void acceptDetails() {
        System.out.println("Enter User Name : ");
        studentName = sc.nextLine();
        System.out.println("Enter Student ID : ");
        studentId = sc.nextInt();
        System.out.println("Enter Student Age : ");
        studentAge = sc.nextInt();
    }

    public void displayDetails() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);
    }
}
class Marks extends Student3 {
       private float objectiveMarks;
       private float subjectMarks;
       void acceptDetails1(){
           System.out.println("Enter Marks : ");
           objectiveMarks = sc.nextFloat();
           System.out.println("Enter Subject Marks : ");
           subjectMarks = sc.nextFloat();
       }
       void displayDetails1(){
           System.out.println("Student Obj Marks : " + objectiveMarks);
           System.out.println("Student Sub Marks : " + subjectMarks);
       }
}
public class Inheritance {
    public static void main(String[] args) {
        // one object acquires all the properties of a parent object
        // can create new classes that built upon existing classes
        Marks obj = new Marks();
        obj.acceptDetails();
        obj.acceptDetails1();
        obj.displayDetails();
        obj.displayDetails1();
    }
}
