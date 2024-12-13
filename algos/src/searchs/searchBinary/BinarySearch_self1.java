package searchs.searchBinary;

public class BinarySearch_self1 {
    public static void main(String[] args) {
//        runtime complexity : O(log(n))

//        PROS
//        Very efficiency for large data sets

//        CONS
//        Slow for small data sets
//        Need sorted data

        int[] array = new int[1000000];
        int target = 75730; // random number within array

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
        int low = 0, high = array.length - 1;
        int countIteration = 0;

        while (low < high) {
            countIteration++;
            int mid = low + (high - low) / 2;
            System.out.println("No at " + countIteration + " iterations. The mid point is " + mid);
            if (target == array[mid]) {
                return mid;
            } else if (target > array[mid]) {
                low = mid;
            } else if (target < array[mid]) {
                high = mid;
            }
        }
        return -1;
    }
}
