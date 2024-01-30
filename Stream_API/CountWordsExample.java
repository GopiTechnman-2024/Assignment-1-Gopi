import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordsExample {
    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> wordCountMap = countWords(wordsList);

        // Print the word count map
        wordCountMap.forEach((word, count) ->
                System.out.println("Word: " + word + ", Count: " + count));
    }

    private static Map<String, Long> countWords(List<String> wordsList) {
        return wordsList.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
    }
}
