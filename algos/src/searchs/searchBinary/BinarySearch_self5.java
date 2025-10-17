package searchs.searchBinary;

public class BinarySearch_self5 {
    public static void main(String[] args) {
//        runtime complexity : O(log(n))

//        PROS
//        Very efficiency for large data sets

//        CONS
//        Slow for small data sets
//        Need sorted data

        int[] array = new int[1000000];
        int target = 501234; // random number within array

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
        int lowIndex = 0;
        int highIndex = array.length - 1;

        int countIteration = 0;

        while (lowIndex < highIndex) {
            int midIndex = lowIndex + (highIndex - lowIndex) / 2;
            countIteration++;
            System.out.println("At #" + countIteration + " iteration. Mid point is " + midIndex);
            if (array[midIndex] == target) {
                return midIndex;
            } else if (target < array[midIndex]) {
                highIndex = midIndex;
            } else {
                lowIndex = midIndex;
            }
        }
        return -1;
    }
}
