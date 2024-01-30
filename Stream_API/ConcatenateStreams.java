import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStreams {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("D", "E", "F");

        // Convert lists to streams
        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        // Concatenate the streams using Stream.concat()
        Stream<String> concatenatedStream = Stream.concat(stream1, stream2);

        // Collect the elements into a list
        List<String> result = concatenatedStream.collect(Collectors.toList());

        // Print the result
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Concatenated List: " + result);
    }
}
