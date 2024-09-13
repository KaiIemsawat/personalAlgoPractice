package sorts.sortQuick;

public class QuickSort_RE {

    public static void main(String[] args) {
//        Quick Sort = moves smaller element to left of the pivot. DIVIDE AND CONQUER
//        Recursively divide array in 2 partitions

//        Best case => Quadratic time O(n log(n))
//        average case => O(n log(n))
//        worst case => O(n^2) if already sorted

//        Space complexity : O(log(n)) due to recursion

        int array[] = {5,5,7,8,3,-3,12,1,4};
        // -3, 1, 3, 4, 5, 5, 7, 8, 12,
        // Quick Sort requires 3 argument (the array, start (index 0), end (last index))
        quickSort(array, 0, array.length - 1);

        System.out.println("Quick Sort");
        for (int i : array) System.out.print(i + ", ");
    }

    private static void quickSort(int[] array, int start, int end) {
        // For recursion break
        if (end <= start) return;;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1); // work on the left side
        quickSort(array, pivot + 1, end); // work on the right side
    }

    private static int partition(int[] array, int start, int end) {
        // Find a pivot (Start with the last index value)
        int pivot = array[end];
        int i = start - 1;

        // Iterate through array, if array[j] is less that pivot, move 'i' and swap array[i] with array[j]
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Once iterate into pivot, swap the pivot value with array[i]
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        // Then return 'i' to be used as new pivot value
        return i;
    }
}
