package sorts.sortMerge;

public class MergeSort_self2 {
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

        int leftIdx = 0, rightIdx = 0;
        for (; leftIdx < arrayLength; leftIdx++) {
            if (leftIdx < midIndex) {
                leftArr[leftIdx] = inputArr[leftIdx];
            } else {
                rightArr[rightIdx] = inputArr[leftIdx];
                rightIdx++;
            }
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(leftArr, rightArr, inputArr);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] inputArr) {
        int leftLength = leftArr.length, rightLength = rightArr.length;
        int mainIndex = 0, leftIdx = 0, rightIdx = 0;

        while (leftIdx < leftLength && rightIdx < rightLength) {
            if (leftArr[leftIdx] < rightArr[rightIdx]) {
                inputArr[mainIndex] = leftArr[leftIdx];
                leftIdx++;
            } else {
                inputArr[mainIndex] = rightArr[rightIdx];
                rightIdx++;
            }
            mainIndex++;
        }
        while (leftIdx < leftLength) {
            inputArr[mainIndex] = leftArr[leftIdx];
            leftIdx++;
            mainIndex++;
        }
        while (rightIdx < rightLength) {
            inputArr[mainIndex] = rightArr[rightIdx];
            rightIdx++;
            mainIndex++;
        }
    }
}
