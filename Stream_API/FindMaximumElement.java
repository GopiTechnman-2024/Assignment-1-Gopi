public class FindMaximumElement {
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 15, 7, 20};

        int maxElement = findMaximumElement(array);

        System.out.println("Maximum Element: " + maxElement);
    }

    private static int findMaximumElement(int[] array) {
        // Check if the array is not empty
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int maxElement = array[0];

        // Iterate through the array to find the maximum element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        return maxElement;
    }
}
