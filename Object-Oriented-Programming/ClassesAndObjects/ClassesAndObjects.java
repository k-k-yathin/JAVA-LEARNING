import java.util.Scanner;

class Student{
    // Data Members of Student class
     int studentId;
     String studentName;
     int studentAge;
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
public class ClassesAndObjectsExample {
    public static void main(String[] args) {
         Student Student = new Student();
         Student.acceptDetails();
         Student.displayDetails();
         Student Student1;
         Student1 = new Student();
         Student1.acceptDetails();
         Student1.displayDetails();
    }
}
