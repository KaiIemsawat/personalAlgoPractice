public class QuickSort {

    public static void main(String[] args) {

        /* ===== Quick Sort =====*/
//        moves smaller element to the left side of a pivot. Recursively divide array in 2 partitions

//        run-time complexity
//        - Best case - O(n log(n))
//        - Average case - O(n log(n))
//        - Worst case O(n^2) if already sorted

//        Space complexity - O(log(n)) due to recursion

        int[] numArr = {12, 4, 765, 34, 123, 3, 65, 4, 786, 54,12, 345, 434, 122};

        quickSort(numArr, 0, numArr.length - 1);
        for (int i : numArr) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (end <= start) {
            return; // base case
        }
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int i = start -1;

        for (int j = start; j < end - 1; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
}
