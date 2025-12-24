import java.util.HashMap;
import java.util.Map;

class Customer1{
    private String name;
    private String email;

    public Customer1(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String getName(){
        return email;
    }
    @Override
    public String toString(){
        return "[name :" + this.name + "email : "+this.email+"]";
    }
}
public class MapInterface {
    public  static void main(String[] args) {
        // map is a collection that stores key-value pair
        Customer1 c1 = new Customer1("Jack","jacl@gmail.com");
        Customer1 c2 = new Customer1("yathin","yathin123@gmail.com");
        Map<String,Customer1> map = new HashMap<>();
        map.put(c1.getName(),c1);
        map.put(c2.getName(),c2);
        System.out.println(map);

        System.out.println(map.get("yathin"));
        var unknown = new Customer1("unknown","unknown");
        System.out.println(map.getOrDefault(unknown.getName(),unknown));

        System.out.println(map.containsKey("yathin"));
        map.remove("yathin",new  Customer1("unknown","unknown"));
        for(var key : map.keySet()){
            System.out.println(map.get(key));
        }
        for(var entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}
