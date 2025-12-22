class Student2{
    int age;
    String name;
    int id;

    // Default Constructor
    Student2(){
        id=45;
        name="Sam";
        age=15;
    }

    // Parameterized Constructor
    Student2(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    // Constructor Overloading
    // can change the sequence or no of parameters
    Student2(String name,int age){
        this.name=name;
        this.age=age;
    }

    //Constructor Chaining
    //Calling one constructor from another w.r.t.o the current object
    //within same class or base class(though inheritance
    // should be done only in the first line
    Student2(String name,int age,int id){
        this(1002,"ridly",25);
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(id);
    }
}
public class Constructors {
    public static void main(String[] args){
         Student2 student = new Student2(23,"jack",18);
         student.display();
         Student2 student2 = new Student2();
         student2.display();
    }
}
