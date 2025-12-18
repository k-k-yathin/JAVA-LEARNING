import java.util.*;
public class DataTypes {
    public static void main(String[] args){
        // there are two types : primitive and non primitive(also called as references)
        // primitive data types
        byte age = 23;
        int count = 123_456_789;  //in code we use _ instead of a comma
        long another_count = 3_123_236_344L;
        float f = 3.14f;
        double net_price = 12345.6784566;// for long or float data type use a l or f as a suffix
        char gender = 'M';
        boolean b = true;
        System.out.println(age);
        System.out.println(count);
        System.out.println(another_count);
        System.out.println(f);
        System.out.println(net_price);
        System.out.println(gender);
        System.out.println(b);
        // non primitive data types
        // classes,strings,date etc
        String message = "Hello World";
        char ch = message.charAt(2);
        System.out.println(ch);
        Date now = new Date();
        System.out.println(now);
    }
}
