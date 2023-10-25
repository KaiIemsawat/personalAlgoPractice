package sorts.sortQuick;

public class QuickSort {
    public static void main(String[] args) {
//        Quick Sort = moves smaller element to left of the pivot. DIVIDE AND CONQUER
//        Recursively divide array in 2 partitions

//        Quadratic time O(n log(n))
//        average case O(n log(n))
//        worst case O(n^2) if already sorted

//        Space complexity : O(log(n)) due to recursion

        int array[] = {15,5,7,8,3,82,4,9,8,12,1,2,6};
        quickSort(array, 0, array.length - 1);

        System.out.println("Quick Sort");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    private static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (endIndex <= startIndex) return;

        int pivot = partition(arr, startIndex, endIndex);

//        Think of these parts as we are working with only sections of the array
        quickSort(arr, startIndex, pivot-1);
        quickSort(arr, pivot+1, endIndex);
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int i = startIndex-1;
        for (int j = startIndex; j<endIndex; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[endIndex];
        arr[endIndex] = temp;

        return i;
    }
}
