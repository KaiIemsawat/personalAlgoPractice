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
        int begin = 0, end = array.length - 1;
        int countIteratin = 0;

        while (begin < end) {
            int midpoint = begin + (end - begin) / 2;

            countIteratin++;
            System.out.println("CURRENT MIDPOINT IS : " + midpoint + " AT ITERATION #" + countIteratin);
            int value = array[midpoint];
            if (target < value) {
                end = midpoint;
            } else if (target > value) {
                begin = midpoint;
            } else if (target == value) {
                return midpoint;
            }
        }

        return -1;
    }
}
