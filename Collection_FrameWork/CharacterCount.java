import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String inputString = "programming";

        Map<Character, Integer> charCountMap = countCharacters(inputString);

        // Print the count of each character
        System.out.println("Character Counts:");
        charCountMap.forEach((character, count) ->
                System.out.println("'" + character + "': " + count));
    }

    private static Map<Character, Integer> countCharacters(String inputString) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character in the string
        for (char c : inputString.toCharArray()) {
            // Update the count in the map
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}
