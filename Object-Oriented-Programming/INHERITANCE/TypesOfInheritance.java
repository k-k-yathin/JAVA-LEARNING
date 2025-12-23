import java.util.Scanner;

class Student4 {
    // Data Members of Student class
    protected int studentId;
    protected String studentName;
    protected int studentAge;
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
class Marks1 extends Student4 {

    protected float objectiveMarks;
    protected float subjectMarks;

    public void acceptDetails() {
        super.acceptDetails();
        System.out.println("Enter Marks : ");
        objectiveMarks = sc.nextFloat();
        System.out.println("Enter Subject Marks : ");
        subjectMarks = sc.nextFloat();
    }

    void displayDetails1() {
        System.out.println("Student marks : " + objectiveMarks);
        System.out.println("Student marks1 : " + subjectMarks);
    }
}
class Sports extends Marks1 {
    protected float score;
    public void acceptDetails() {
        super.acceptDetails();
        System.out.println("Enter Score : ");
        score = sc.nextFloat();
    }
    void displayDetails2() {
        System.out.println("Score : " + score);
    }
}
class Results extends Sports {
    protected float totalMarks;
    protected float averageMarks;
    void calculateResults() {
        totalMarks=objectiveMarks+subjectMarks+score;
        averageMarks=totalMarks/3;
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average Marks : " + averageMarks);
    }
}
public class TypesOfInheritance {
    public static void main(String[] args) {
        //only 3 types :
        //single inheritance (A->B)
        //Hierarchical inheritance (C->A , C->B)
        //Multilevel inheritance (A->B->C)
        Results student = new Results();
        student.acceptDetails();     // Takes all inputs once
        student.displayDetails();    // Student info
        student.displayDetails1();   // Marks
        student.displayDetails2();   // Sports score
        student.calculateResults();  // Total & average
    }
}
