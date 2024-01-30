//***LinkedList uses more memory than ArrayList 
//because it needs additional memory for pointers. ***


import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {
        
        // Creating a LinkedList.
        List<String> linkedList = new LinkedList<>();

        // Adding names.
        linkedList.add("Gopi");
        linkedList.add("Bhavya");
        linkedList.add("Devang");
        linkedList.add("Krishna");
        linkedList.add("Vedika");

        // Accessing name.
        String name = linkedList.get(2);

        // Updating names.
        linkedList.set(1, "Bhagu");

        // Removing names.
        linkedList.remove("Bhagu");
        linkedList.remove(0);

        // Size checking.
        int size = linkedList.size();

        // Checking whether list is empty or not.
        boolean isEmpty = linkedList.isEmpty();
        
        // Checking whether names are existing in the list or not.
        boolean nameExist = linkedList.contains("Bhagu");

        // Remove all the names.
        linkedList.clear();

        // Iterating over Elements.
        System.out.println("Iterating Over LinkedList:");
        for (String currentName : linkedList) {
            System.out.println(currentName);
        }

        // Additional LinkedList-specific Operation: Adding to the Front
((LinkedList<String>) linkedList).addFirst("New First Name");
    }
}






