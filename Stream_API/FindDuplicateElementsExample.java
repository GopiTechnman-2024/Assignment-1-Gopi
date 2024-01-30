import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElementsExample {
    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> duplicateCountsMap = findDuplicateElements(wordsList);

        // Print the duplicate elements with their counts
        duplicateCountsMap.forEach((word, count) ->
                System.out.println("Word: " + word + ", Count: " + count));
    }

    private static Map<String, Long> findDuplicateElements(List<String> wordsList) {
        return wordsList.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
