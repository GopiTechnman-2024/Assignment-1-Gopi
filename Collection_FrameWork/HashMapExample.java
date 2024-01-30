import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample{
    public static void main(String[] args) {

        // HashMap Creation
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("Gopi", 21);
        hashMap.put("Bhagu", 24);
        hashMap.put("Bhavya", 05);

        // Accessing values using get
        System.out.println("Age of Gopi: " + hashMap.get("Gopi"));

        // Checking if a Name(Key) is present
        System.out.println("Is Gopi present? " + hashMap.containsKey("Gopi"));

        // Checking if an Age(Value) is present
        System.out.println("Is age 30 present? " + hashMap.containsValue(30));

        // Printing all keys using keySet
        System.out.println("Keys: " + hashMap.keySet());

        // Printing all values using values
        System.out.println("Values: " + hashMap.values());

        // Printing all key-value pairs using entrySet
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        System.out.println("Key-Value pairs:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing a key
        hashMap.remove("Gopi");
        System.out.println("HashMap after removing Gopi: " + hashMap);

        // Clearing the HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    }
}
