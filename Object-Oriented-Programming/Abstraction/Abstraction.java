import models.User;

public class Abstraction {
    public static void main(String[] args) {
        // hides the implementation details and shows only the functionality
        User user = new User();
        user.setName("K K YATHIN");
        user.setAge(18);
        System.out.println("Name : " + user.getName());
        System.out.println("Age : " + user.getAge());
    }
}
