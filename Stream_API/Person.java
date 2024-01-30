import java.util.*;
import java.util.stream.Collectors;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(1, "Alice"),
                new Person(2, "Bob"),
                new Person(3, "Alice"), // Duplicate key
                new Person(4, "Charlie"),
                new Person(2, "David")   // Duplicate key
        );

        Map<Integer, String> sortedMap = convertListToSortedMap(personList);

        // Print the resulting map
        System.out.println("Sorted Map: " + sortedMap);
    }

    private static Map<Integer, String> convertListToSortedMap(List<Person> personList) {
        
        return personList.stream()
                .collect(Collectors.toMap(Person::getId,Person::getName,(existing, replacement) -> existing, TreeMap::new ));
    }
}
