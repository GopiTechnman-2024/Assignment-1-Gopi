import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_All_Method{

    public static void main(String[] args) {
        // creating empty stream
        // to avoid null exception
        Stream<String> streamEmpty = Stream.empty();
        
        // Nothing will be printed
        streamEmpty.forEach(System.out::println);


        // Stream of collection
        Collection<String> collection = Arrays.asList("a", "b", "c");
        System.out.println(collection);
        Stream<String> streamOfCollection = collection.stream();
        streamOfCollection.forEach(System.out::println);

        // Stream of array (Using Stream.of())
        Stream<String> streamOfArray = Stream.of("a", "b", "c");
        streamOfArray.forEach(System.out::println);

        //Stream of array (Using Arrays.stream())
        String[] myArray={"a","b","c","d"};
        Stream<String> streamFromArray = Arrays.stream(myArray);
        streamFromArray.forEach(System.out::println);

        //When builder is used, the desired type should be additionally
        // specified in the right part of the statement, otherwise the build() 
        //method will create an instance of the Stream<Object>:
        // stream of builder
        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();

        // Perform a simple stream operation (collecting elements into a list in this case)
        streamBuilder.forEach(System.out::println);

        // stream builder
        Stream<String> streamGenerated =
  Stream.generate(() -> "element").limit(10);
  streamGenerated.forEach(System.out::println);

  
 // Stream.iterate()
  //Another way of creating an infinite stream is by using the iterate() method:

Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
streamIterated.forEach(System.out::println);

 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 1. filter
        List<Integer> filteredList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Filtered List: " + filteredList);

        // 2. map
        List<String> mappedList = numbers.stream()
                .map(n -> "Number " + n)
                .collect(Collectors.toList());
        System.out.println("Mapped List: " + mappedList);

        // 3. flatMap
        List<String> flatMappedList = numbers.stream()
                .flatMap(n -> Arrays.asList("A" + n, "B" + n).stream())
                .collect(Collectors.toList());
        System.out.println("Flat-Mapped List: " + flatMappedList);

        // 4. distinct
        List<Integer> distinctList = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct List: " + distinctList);

        // 5. sorted
        List<Integer> sortedList = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted List: " + sortedList);

        // 6. peek
        List<Integer> peekedList = numbers.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println("Peeked List: " + peekedList);

        // 7. forEach
        numbers.stream()
                .forEach(System.out::println);

        // 8. toArray
        Integer[] array = numbers.stream()
                .toArray(Integer[]::new);
        System.out.println("Array: " + Arrays.toString(array));

        // 9. collect
        String concatenatedString = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("Concatenated String: " + concatenatedString);

        // 10. reduce
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // 11. count
        long count = numbers.stream()
                .count();
        System.out.println("Count: " + count);

        // 12. anyMatch
        boolean anyMatchResult = numbers.stream()
                .anyMatch(n -> n > 5);
        System.out.println("Any Match Result: " + anyMatchResult);

        // 13. findFirst
        Integer firstElement = numbers.stream()
                .findFirst()
                .orElse(null);
        System.out.println("First Element: " + firstElement);

        // 14. forEachOrdered
        System.out.println("ForEachOrdered:");
        numbers.stream()
                .parallel()
                .forEachOrdered(System.out::println);

        // 15. limit
        List<Integer> limitedList = numbers.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Limited List: " + limitedList);

        // 16. skip
        List<Integer> skippedList = numbers.stream().skip(5).collect(Collectors.toList());
        System.out.println("Skipped List: " + skippedList);
    }
}


    
