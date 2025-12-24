import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SetInterface {

    public static void main(String[] args) {
        // unordered collection of unique elements
        // implemented by hashsets,linked hashsets,treeSets
        // hashsets stores elements using hashing , sorts automatically
        // linked hashsets a linked list implementation , contains unique elements like hashset
        // treeSets a tree implementation ,stores in ascending order , access and retrieval time are faster
        Set<String> set = new HashSet<String>();
        set.add("Sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

        // remove duplicates from a collection
        Collection<String> collection = new ArrayList<>() ;
        Collections.addAll(collection, "Sky", "is", "blue", "blue");
        System.out.println(collection);
        Set<String> anotherSet = new HashSet<>(collection);
        System.out.println(anotherSet);

        // Set Operations : Union ,Intersection ,Difference
        Set<String> set1 = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b","c","d"));
        //Union
        //set1.addAll(set2);
        //System.out.println(set1);

        //Intersection
        //set1.retainAll(set2);
        //System.out.println(set1);

        // Difference
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
