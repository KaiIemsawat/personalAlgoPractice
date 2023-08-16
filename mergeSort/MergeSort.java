import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        /* ===== Merge Sort ===== */
//        Recursively divide array in 2, sort, re-combine
//        Run-time complexity = O(n log n)
//        space complexity = O(n)

        int[] array = {2, 6, 876, 23, 123, 6, 989, 43, 21, 66, 22};
        mergeSort(array);
        System.out.print(Arrays.toString(array));
//        [2, 6, 6, 21, 22, 23, 43, 66, 123, 876, 989]
    }

    private static void mergeSort(int[] array) {

        int mainArrLength = array.length;
        if (mainArrLength <= 1) {
            return; // base case
        }
        int middleIndex = mainArrLength / 2;
        int[] leftArr = new int[middleIndex];
        int[] rightArr = new int[mainArrLength - middleIndex];

        int i = 0, j = 0; // Index i for Left Array and index j for the right

//        Assign elements' values from main(original array in case of first iteration) array
//        to left and right array
        for(; i < mainArrLength; i++) {
            if(i < middleIndex ) {
                leftArr[i] = array[i];
            }
            else {
                rightArr[j] = array[i];
                j++;
            }
        }

//        Recursively call until array size is one
        mergeSort(leftArr);
        mergeSort(rightArr);

//        merge - merging happens each layer of recursion at the end of the process
        merge(leftArr, rightArr, array);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {

        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0, iL = 0, iR = 0; // indexes

//        Check conditions for merging
        while(iL < leftSize && iR < rightSize) {
//            if the element from left array is less than the one from right array,
//            assign the value from left array to the main array
            if(leftArr[iL] < rightArr[iR]) {
                arr[i] = leftArr[iL];
                iL++;
            }
//            if the element from right array is less than the one from left array,
//            assign the value from right array to the main array
            else {
                arr[i] = rightArr[iR];
                iR++;
            }
            i++;
        }
//        In case of only one element in left array
        while(iL < leftSize) {
            arr[i] = leftArr[iL];
            i++;
            iL++;
        }
//        In case of only one element in right array
        while(iR < rightSize) {
            arr[i] = rightArr[iR];
            i++;
            iR++;
        }
    }

}