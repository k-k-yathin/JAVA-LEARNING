import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Customer implements Comparable<Customer>{

    private String name;
    public Customer(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Customer c){
        // this < other return -1 or Negative value
        // this > other return 1 or Positive value
        // this == other return 0
          return name.compareTo(c.name);
    }
    @Override
    public String toString() {
        return "Customer Name: " + this.name;
    }
}
public class ComparableInterface {
    public static void main(String[] args) {
        // contains a single method compareTo()
        // compare objects of same types
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C"));
        customers.add(new Customer("B"));
        customers.add(new Customer("A"));
        System.out.println(customers);
        Collections.sort(customers);
        System.out.println(customers);
    }
}
