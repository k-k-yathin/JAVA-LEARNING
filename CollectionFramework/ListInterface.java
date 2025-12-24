import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListInterface {
    public static void main(String[] args) {
        // allows duplicate values
        // used to store ordered collection
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        list.add(0,"initial value");
        System.out.println(list);
        Collections.addAll(list,"d","e","f");
        System.out.println(list);
        System.out.println(list.get(0));
        list.set(0,null);
        System.out.println(list);
        list.remove(0);
        list.remove("d");
        System.out.println(list.indexOf("e"));
        System.out.println(list.lastIndexOf("e"));
        System.out.println(list.subList(0,3));
    }
}
