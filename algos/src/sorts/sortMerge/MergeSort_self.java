package sorts.sortMerge;

public class MergeSort_self {

    public static void main(String[] args) {
        // get original array length
        // recursively divide array to 2 (return when array size <= 1), sort, re-combine
        // divide and conquer
        // Quadratic time O(n log(n))
        // Linear Space O(n)

        int array[] = { 5, 7, 2, -3, 82, 4, 9, 11, 2, -5 };
        //              -5, -3, 2, 2, 4, 5, 7, 9, 11, 82,
        mergeSort(array);
        System.out.println("Merge Sort");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    private static void mergeSort(int[] inputArray) {
        int inputArrayLength = inputArray.length;
        if (inputArrayLength <= 1) return;

        int midIdx = inputArrayLength/2;
        int[] leftArr = new int[midIdx];
        int[] rightArr = new int[inputArrayLength - midIdx];

        int leftIdx = 0, rightIdx = 0;

        for (; leftIdx < inputArrayLength; leftIdx++) {
            if (leftIdx < midIdx) {
                leftArr[leftIdx] = inputArray[leftIdx];
            } else {
                rightArr[rightIdx] = inputArray[leftIdx];
                rightIdx++;
            }
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(leftArr, rightArr, inputArray);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] inputArray) {
        int lArrSize = leftArr.length;
        int rArrSize = rightArr.length;
        int mainArrIndex = 0, leftIdx = 0, rightIdx = 0;

        while (leftIdx < lArrSize && rightIdx < rArrSize) {
            if (leftArr[leftIdx] < rightArr[rightIdx]) {
                inputArray[mainArrIndex] = leftArr[leftIdx];
                leftIdx++;
            } else {
                inputArray[mainArrIndex] = rightArr[rightIdx];
                rightIdx++;
            }
            mainArrIndex++;
        }

        while (leftIdx < lArrSize) {
            inputArray[mainArrIndex] = leftArr[leftIdx];
            leftIdx++;
            mainArrIndex++;
        }
        while (rightIdx < rArrSize) {
            inputArray[mainArrIndex] = rightArr[rightIdx];
            rightIdx++;
            mainArrIndex++;
        }
    }

}
