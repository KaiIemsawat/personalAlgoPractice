package sorts.sortQuick;

public class QuickSort_RE {

    public static void main(String[] args) {
//        Quick Sort = moves smaller element to left of the pivot. DIVIDE AND CONQUER
//        Recursively divide array in 2 partitions

//        Best case => Quadratic time O(n log(n))
//        average case => O(n log(n))
//        worst case => O(n^2) if already sorted

//        Space complexity : O(log(n)) due to recursion

        int array[] = {5,5,7,8,3,-3,12,1,2};
        quickSort(array, 0, array.length - 1);

        System.out.println("Quick Sort");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
    //-3, 1, 2, 3, 5, 5, 7, 8, 12,
    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) return;;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1); // work on the left side
        quickSort(array, pivot + 1, end); // work on the right side
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
