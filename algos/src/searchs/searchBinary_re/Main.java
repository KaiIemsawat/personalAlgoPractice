package searchs.searchBinary_re;

public class Main {
    public static void main(String[] args) {

        // binary search - Search algorithm
        //                 Search a value within a SORTED array.
        //                 Eliminate half of the array each iteration.
        // O log(n)

        int[] array = {1,2,4,6,8,9,12,23,35,36,37,42,45,48,49,52,54,55,56};
        int target = 9;

        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " Not found");
        } else System.out.println("Found " + target + " at index : " + index);
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length-1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("Current middle : " + value);

            if (value < target) low = middle + 1;
            else if (value > target) high = middle -1;
            else return middle;
        }
        return -1;
    }
}
