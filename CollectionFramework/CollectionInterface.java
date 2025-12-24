import java.util.*;
public class CollectionInterface {
    public static void main(String[] args) {
        //Root interface of java collection framework
        // Implemented through sub interfaces like List , Set and Queue
        Collection<String> collection = new ArrayList();
        collection.add("Value 1");
        collection.add("Value 2");
        collection.add("Value 3");
        System.out.println(collection);

        // Add Multiple Values to a Collection
        Collections.addAll(collection,"Value 4","Value 5","Value 6");
        System.out.println(collection);
        collection.remove("Value 4");
        System.out.println(collection);

        System.out.println(collection.size());
        for(String item : collection){
            System.out.println(item);
        }
        collection.clear();
        System.out.println(collection.isEmpty());

        Collection<String> otherCollection = new ArrayList();
        otherCollection.addAll(collection);
        // checks the memory allocation
        System.out.println(otherCollection==collection);
        // checks the elements
        System.out.println(otherCollection.equals(collection));
    }
}
