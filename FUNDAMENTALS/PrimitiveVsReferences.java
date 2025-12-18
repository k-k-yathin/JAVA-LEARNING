import java.awt.*;
import java.util.*;
public class PVNP {
    public static void main(String[] args) {
        // primitive vs non primitive

        // primitive (holds the variable)
        int num1 = 10;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);
        num1 = 1000;
        num2 = 2000;
        System.out.println(num1);
        System.out.println(num2);

        // reference (holds the address)
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        System.out.println(point1);
        System.out.println(point2);
        point1.x=100;
        point1.y=200;
        System.out.println(point1);
        System.out.println(point2);
    }
}
