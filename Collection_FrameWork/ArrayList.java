// ****** It is always good practise to store 
//value in reference of an interface. ****




import java.util.*;

public class ArrayList{

    public static void main(String[] args) {
        
        // Creating an ArrayList.
        List<String> L = new ArrayList<>();

        // Adding names.
        L.add("Gopi");
        L.add("Bhavya");
        L.add("Devang");
        L.add("Krishna");
        L.add("Vedika");

        // Accessing name.
        String name = L.get(2); 

        //Updating names.
        L.set(1, "Bhagu"); 

        // Removing names
        L.remove("Bhagu"); 
        L.remove(0); 

        // size checking 
        int size = L.size(); 

        // checking whether list is empty or not
        boolean isEmpty = L.isEmpty();
        
        // Checking whether names are existing in a List or not
        boolean nameExist = L.contains("Bhagu"); 

        // Remove all the names.
        L.clear(); // Removes all elements from the ArrayList

        // Iterating over Elements.
        for (String Name : L) {
            System.out.println(Name);
        }
        










    }
}