import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3, 7, 4, 6);

        List<Integer> sortedList = sortList(numbers);

        System.out.println("Original List: " + numbers);
        System.out.println("Sorted List: " + sortedList);
    }

    private static List<Integer> sortList(List<Integer> numbers) {
        return numbers.stream()
                .sorted() // Use the sorted() method to sort the elements
                .collect(Collectors.toList());
    }
}
