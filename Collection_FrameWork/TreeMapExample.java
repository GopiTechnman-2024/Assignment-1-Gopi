import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        // Creating a TreeMap with natural ordering (based on keys)
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put("Gopi", 21);
        treeMap.put("Bhagu", 24);
        treeMap.put("Bhavya", 05);

        // Accessing values using get
        System.out.println("Age of Gopi: " + treeMap.get("Gopi"));

        // Checking if a key is present
        System.out.println("Is Gopi present? " + treeMap.containsKey("Gopi"));

        // Checking if a value is present
        System.out.println("Is age 30 present? " + treeMap.containsValue(30));

        // Printing all keys using keySet
        System.out.println("Keys: " + treeMap.keySet());

        // Printing all values using values
        System.out.println("Values: " + treeMap.values());

        // Printing all key-value pairs using entrySet
        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
        System.out.println("Key-Value pairs:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing a key
        treeMap.remove("Gopi");
        System.out.println("TreeMap after removing Gopi: " + treeMap);

        // Clearing the TreeMap
        treeMap.clear();
        System.out.println("TreeMap after clearing: " + treeMap);
    }
}
