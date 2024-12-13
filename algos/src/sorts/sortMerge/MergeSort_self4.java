package sorts.sortMerge;

public class MergeSort_self4 {
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

        int inputArrMidPoint = inputArrLength / 2;
        int[] leftArr = new int[inputArrMidPoint];
        int[] rightArr = new int[inputArrLength - inputArrMidPoint];

        int leftIdx = 0, rightIdx = 0;
        for (; leftIdx < inputArrLength; leftIdx++) {
            if (leftIdx < inputArrMidPoint) {
                leftArr[leftIdx] = inputArr[leftIdx];
            } else {
                rightArr[rightIdx] = inputArr[leftIdx];
                rightIdx++;
            }
        }

        mergeSort(leftArr); mergeSort(rightArr);
        merge(leftArr, rightArr, inputArr);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] inputArr) {
        int leftIdx = 0, rightIdx = 0, mainArrIdx = 0;
        int leftArrLength = leftArr.length, rightArrLength = rightArr.length;

        while (leftIdx < leftArrLength && rightIdx < rightArrLength) {
            if (leftArr[leftIdx] < rightArr[rightIdx]) {
                inputArr[mainArrIdx] = leftArr[leftIdx];
                leftIdx++;
            } else {
                inputArr[mainArrIdx] = rightArr[rightIdx];
                rightIdx++;
            }
            mainArrIdx++;
        }
        while (leftIdx < leftArrLength) {
            inputArr[mainArrIdx] = leftArr[leftIdx];
            leftIdx++; mainArrIdx++;
        }
        while (rightIdx < rightArrLength) {
            inputArr[mainArrIdx] = rightArr[rightIdx];
            rightIdx++; mainArrIdx++;
        }
    }
}
