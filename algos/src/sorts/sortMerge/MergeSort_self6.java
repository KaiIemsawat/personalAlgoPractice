package sorts.sortMerge;

public class MergeSort_self6 {
    public static void main(String[] args) {
        // - get original array length. If the length <= 1 return
        // - create 2 arrays, create a method to assign values from input array to the arrays
        // - recursively call dividing method (mergeSort())
        // - merge arrays back

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
        int inputArrLength = inputArr.length;
        if (inputArrLength <= 1) return;

        int midPoint = inputArrLength / 2;

        int[] leftArr = new int[midPoint];
        int[] rightArr = new int[inputArrLength - midPoint];

        int leftIndex = 0, rightIndex = 0;

        for (; leftIndex < inputArrLength; leftIndex++) {
            if (leftIndex < midPoint) {
                leftArr[leftIndex] = inputArr[leftIndex];
            } else {
                rightArr[rightIndex] = inputArr[leftIndex];
                rightIndex++;
            }
        }

        mergeSort(leftArr); mergeSort(rightArr);

        merge(leftArr, rightArr, inputArr);

    }

    private static void merge(int[] leftArr, int[] rightArr, int[] inputArr) {
        int leftIdx = 0, rightIdx = 0, mainIdx = 0;
        int leftSize = leftArr.length, rightSize = rightArr.length;

        while (leftIdx < leftSize && rightIdx < rightSize) {
            if (leftArr[leftIdx] < rightArr[rightIdx]) {
                inputArr[mainIdx] = leftArr[leftIdx];
                leftIdx++;
            } else {
                inputArr[mainIdx] = rightArr[rightIdx];
                rightIdx++;
            }
            mainIdx++;
        }
        while (leftIdx < leftSize) {
            inputArr[mainIdx] = leftArr[leftIdx];
            mainIdx++; leftIdx++;
        }
        while (rightIdx < rightSize) {
            inputArr[mainIdx] = rightArr[rightIdx];
            mainIdx++; rightIdx++;
        }
    }
}
