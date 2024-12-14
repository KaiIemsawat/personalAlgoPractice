package searchs.searchBinary;

public class BinarySearch_self2 {
    public static void main(String[] args) {
//        runtime complexity : O(log(n))

//        PROS
//        Very efficiency for large data sets

//        CONS
//        Slow for small data sets
//        Need sorted data

        int[] array = new int[1000000];
        int target = 7530; // random number within array

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

        int lowIdx = 0, hiIdx = array.length - 1;
        int countIteration = 0;

        while (lowIdx < hiIdx) {
            countIteration++;
            int midIdx = lowIdx + (hiIdx - lowIdx) / 2;
            int value = array[midIdx];

            System.out.println("At #" + countIteration + " iteration. On index # " + midIdx);

            if (target == value) {
                return value;
            } else if (target > value) {
                lowIdx = midIdx;
            } else if (target < value) {
                hiIdx = midIdx;
            }
        }
        return -1;
    }
}
