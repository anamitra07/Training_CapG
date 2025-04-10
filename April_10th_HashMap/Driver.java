package April_10th_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {

        // defining a hashmap<key, value>
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India",120);
        map.put("USA",30);
        map.put("China",150);

        // print a hashmap
        System.out.println(map);

        // Search for a key
        if(map.containsKey("Indonesia")) {
            System.out.println("Key is present in map");
        }
        else {
            System.out.println("Key is not present in map");
        }

        // Search for a value associated with a key
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        // Iteration in a HashMap
        for (Map.Entry<String, Integer> e: map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Here, e contains all the Keys along with its values.

        // Remove a key from the HashMap
        map.remove("China");
        System.out.println(map);
    }
}
