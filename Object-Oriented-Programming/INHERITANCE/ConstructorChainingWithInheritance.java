class person{
    private  String name;
    private int age;
    public person() {
        this.name = "Anonymous";
        this.age = 18;
    }
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showDetails(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
class Employee extends person{
    private float salary;
    private String designation;
    public Employee() {
        super();  // even if we don't write it still the super/parent class constructor will show up
        this.salary = 12000;
        this.designation = "Manager";
    }
    public Employee( String name,int age,float salary, String designation) {
        super(name, age);
        // super() for getting the default constructor from the parent class
        // super("Yathin",18) for getting a parametrized constructor from parent class(forcefully)
        this.salary = salary;
        this.designation = designation;
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("salary : " + salary);
        System.out.println("designation : " + designation);
    }
}
public class ConstructorChainingWithInheritance {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.showDetails();
        Employee employee2 = new Employee("Sarah",45,10000,"Queen");
        employee2.showDetails();
    }
}
