package sorts.sortMerge;

public class MergeSort_self3 {
    public static void main(String[] args) {
        // - get original array length. If the length <= 1 return
        // - create 2 array, recursively divide input array to 2, sort, re-combine

        // divide and conquer
        // Quadratic time O(n log(n))
        // Linear Space O(n)

        int inputArr[] = { 5, 7, 2, -3, 82, 4, 9, 11, 2, -5 };
        //              -5, -3, 2, 2, 4, 5, 7, 9, 11, 82,
        mergeSort(inputArr);
        System.out.println("Merge Sort");
        for (int i : inputArr) {
            System.out.print(i + ", ");
        }
    }

    private static void mergeSort(int[] inputArr) {
        int arrayLength = inputArr.length;
        if (arrayLength <= 1) return;

        int midIndex = arrayLength / 2;
        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[arrayLength - midIndex];

        // Dividing function ---
        int leftIdx = 0, rightIdx = 0, mainIdx = 0;
        for (; leftIdx < arrayLength; leftIdx++) {
            if (leftIdx < midIndex) {
                leftArr[leftIdx] = inputArr[leftIdx];
            } else {
                rightArr[rightIdx] = inputArr[leftIdx];
                rightIdx++;
            }
        }

        // Recursively dividing ---
        mergeSort(leftArr);
        mergeSort(rightArr);

        // Part of method, will recursively merge back a level at a timr
        merge(leftArr, rightArr, inputArr);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] inputArr) {

    }
}
