import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchDemo {

    /*
    *   Search algorithm that finds the position of a target value within a SORTED array.
    *   Half of the array is eliminated during each iterate.
    *   Good for large number.
    */

    public static void main(String[] args) {

        int[] array = new int[10000];
        for (int i = 0; i< array.length; i++) {
            array[i] = i;
        }
        int target = 34;

//        int index = Arrays.binarySearch(array, target); // using build-in method
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " Not found");
        }
        else System.out.println("Found element : " + index);

    }

    private static int binarySearch(int[] array, int target) {
        int low= 0;
        int high = array.length -1;

        int count = 0; // No need, just count;

        while (low <= high) {
            int middle = low + ((high - low) /2);
            int val = array[middle];
            count++;
            System.out.println("middle : " + val);
            if (val < target) {
                low = middle + 1;
            } else if (val > target) {
                high = middle -1;
            } else {
                System.out.println("Count : " + count);
                return target;
            }
        }

        return -1;
    }
}
