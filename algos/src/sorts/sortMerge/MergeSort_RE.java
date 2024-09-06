package sorts.sortMerge;

public class MergeSort_RE {
    public static void main(String[] args) {
//        recursively divide array to 2, sort, re-combine // divide and conquer
//        Quadratic time O(n log(n))
//        Linear Space O(n)

        int array[] = {15,7,2,-3,82,4,9,5,2,11,-5};

        mergeSort(array);

        System.out.println("Merge Sort");
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    private static void mergeSort(int[] array) {
        int ArrLength = array.length;
        if (ArrLength <= 1) return;

        int middleIndex = ArrLength/2;
        int[] leftArray = new int[middleIndex];
        int[] rightArray = new int[ArrLength - middleIndex];

        int leftArrIndex = 0;
        int rightArrIndex = 0;

        for (;leftArrIndex < ArrLength; leftArrIndex++) {
            if (leftArrIndex < middleIndex) {
                leftArray[leftArrIndex] = array[leftArrIndex];
            }
            else {
                rightArray[rightArrIndex] = array[leftArrIndex];
                rightArrIndex++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftArrSize = arr.length / 2;
        int rightArrSize = arr.length - leftArrSize;
        int i = 0, leftIndex = 0, rightIndex = 0;

//        Check condition for merging
        while (leftIndex < leftArrSize && rightIndex < rightArrSize) {
            if (leftArr[leftIndex] < rightArr[rightIndex]) {
                arr[i] = leftArr[leftIndex];
                leftIndex++;
            }
            else {
                arr[i] = rightArr[rightIndex];
                rightIndex++;
            }
            i++;
        }
        while (leftIndex < leftArrSize) {
            arr[i] = leftArr[leftIndex];
            leftIndex++;
            i++;
        }
        while (rightIndex < rightArrSize) {
            arr[i] = rightArr[rightIndex];
            rightIndex++;
            i++;
        }
    }


}
