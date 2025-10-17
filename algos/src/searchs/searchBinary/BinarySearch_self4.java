package searchs.searchBinary;

public class BinarySearch_self4 {
    public static void main(String[] args) {
//        runtime complexity : O(log(n))

//        PROS
//        Very efficiency for large data sets

//        CONS
//        Slow for small data sets
//        Need sorted data

        int[] array = new int[1000000];
        int target = 554332; // random number within array

//        Create example array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

//        int index = Arrays.binarySearch(array, target); // build in binary search function
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " : Not found");
        }
        else {
            System.out.println("Element: " + target + " found at index: " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length;

        int countIteration = 0;

        while (low < high) {
            int midIndex = low + (high - low) / 2;
            countIteration++;
            System.out.println("At #" + countIteration + " iteration");
            if (array[midIndex] == target) {
                System.out.println("Found target on " + countIteration + " iteration");
                return midIndex;
            } else if (array[midIndex] > target) {
                high = midIndex;
            } else if (array[midIndex] < target) {
                low = midIndex;
            }
        }
        return -1;
    }
}
