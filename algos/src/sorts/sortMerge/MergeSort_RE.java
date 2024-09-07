package sorts.sortMerge;

public class MergeSort_RE {
    public static void main(String[] args) {
        // recursively divide array to 2, sort, re-combine
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

    private static void mergeSort(int[] inputArr) {
        int ArrLength = inputArr.length;
        if (ArrLength <= 1) return;

        // Initialize middle index, and left and right arrays(empty for now)
        int middleIndex = ArrLength / 2;
        int[] leftArray = new int[middleIndex];
        int[] rightArray = new int[ArrLength - middleIndex];

        // Assign values from main array to left and right array
        int lIndex = 0, rIndex = 0;
        for (; lIndex < ArrLength; lIndex++) {
            if (lIndex < middleIndex) {
                leftArray[lIndex] = inputArr[lIndex];
            } else {
                rightArray[rIndex] = inputArr[lIndex];
                rIndex++;
            }
        }

        // Recursively splitting until array size is one and stop.
        // From 'if (ArrLength <= 1) return;' above
        mergeSort(leftArray);
        // Once the array size is '1' on left side, the new recursion will begin for the right side.
        mergeSort(rightArray);
        // Once the array size is '1' on both sides, the recursion (on that level) is finish.
        // Then merge() will be called (for that level)

        // Note : this will also be call on EACH recursion. From, combine single element into 2 elements array and upward
        merge(leftArray, rightArray, inputArr);
        // merge() will be call on every level on each side
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] inputArr) {
        int leftArrSize = leftArr.length;
        int rightArrSize = rightArr.length;
        int mainArrIndex = 0, leftIndex = 0, rightIndex = 0;

        // Check condition for merging
        while (leftIndex < leftArrSize && rightIndex < rightArrSize) {
            if (leftArr[leftIndex] < rightArr[rightIndex]) {
                inputArr[mainArrIndex] = leftArr[leftIndex];
                leftIndex++;
            } else {
                inputArr[mainArrIndex] = rightArr[rightIndex];
                rightIndex++;
            }
            mainArrIndex++;
        }
        while (leftIndex < leftArrSize) {
            inputArr[mainArrIndex] = leftArr[leftIndex];
            leftIndex++;
            mainArrIndex++;
        }
        while (rightIndex < rightArrSize) {
            inputArr[mainArrIndex] = rightArr[rightIndex];
            rightIndex++;
            mainArrIndex++;
        }
    }

}
