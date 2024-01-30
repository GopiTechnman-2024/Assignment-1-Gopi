/*
A LinkedHashMap maintains the order of insertion, 
so the order in which elements are added to the map is preserved.
*/



import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        // Creating a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        linkedHashMap.put("Gopi", 21);
        linkedHashMap.put("Bhagu", 24);
        linkedHashMap.put("Bhavya", 05);

        // Accessing values using get
        System.out.println("Age of Gopi: " + linkedHashMap.get("Gopi"));

        // Checking if a key is present
        System.out.println("Is Gopi present? " + linkedHashMap.containsKey("Gopi"));

        // Checking if a value is present
        System.out.println("Is age 30 present? " + linkedHashMap.containsValue(30));

        // Printing all keys using keySet
        System.out.println("Keys: " + linkedHashMap.keySet());

        // Printing all values using values
        System.out.println("Values: " + linkedHashMap.values());

        // Printing all key-value pairs using entrySet
        Set<Map.Entry<String, Integer>> entrySet = linkedHashMap.entrySet();
        System.out.println("Key-Value pairs:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing a key
        linkedHashMap.remove("Gopi");
        System.out.println("LinkedHashMap after removing Gopi: " + linkedHashMap);

        // Clearing the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("LinkedHashMap after clearing: " + linkedHashMap);
    }
}
