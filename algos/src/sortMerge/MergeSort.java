package sortMerge;

public class MergeSort {
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
        int arrayLength = array.length;
        if (arrayLength <= 1) return; // base case

//        Create a middle point where array will be split in half.
//        Then split the array to two
        int middlePoint = arrayLength/2;
        int[] leftArray = new int[middlePoint];
        int[] rightArray = new int[arrayLength - middlePoint];

        int i = 0; // For working with left array
        int j = 0; // For working with right array

        for (; i < arrayLength; i++) {
//            Assign value to left array
            if (i < middlePoint) {
                leftArray[i] = array[i];
            }
//            Assign value to right array
            else {
                rightArray[j] = array[i];
                j++;
            }
        }

//        Recursively call until array size reduced to 1
        mergeSort(leftArray);
        mergeSort(rightArray);

//        Merging arrays back
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i = 0, leftIndex = 0, rightIndex = 0; // indices

//        Check the conditions for merging
        while(leftIndex < leftSize && rightIndex < rightSize) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
            i++;
        }
        while(leftIndex < leftSize) {
            array[i] = leftArray[leftIndex];
            i++;
            leftIndex++;
        }
        while(rightIndex < rightSize) {
            array[i] = rightArray[rightIndex];
            i++;
            rightIndex++;
        }
    }
}
