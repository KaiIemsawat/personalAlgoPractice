package searchs.searchBinary;

public class BinarySearch_self6 {
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

        int lowIndex = 0, hiIndex = array.length - 1;
        int count = 0;

        while (lowIndex < hiIndex) {
            int midIndex = lowIndex + (hiIndex - lowIndex) / 2;
            count++;
            System.out.println("Search at iteration #" + count);
            if (array[midIndex] == target) {
                System.out.println("Found target at index : " + midIndex);
                return midIndex;
            }
            if (target > array[midIndex]) {
                lowIndex = midIndex;
            } else {
                hiIndex = midIndex;
            }
        }
        return -1;
    }


}
