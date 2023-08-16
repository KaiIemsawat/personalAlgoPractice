import java.util.Arrays;

public class InsertionSort {

    /* ===== Insertion Sort ===== */
//    Comparing to element on the left. Shift to right to make room to insert the value

//    Quadratic time = O(n^2)
//    Small data set = decent
//    Large data set = BAD

//    Less steps than Bubble Sort
//    Best case is O(n) compared to Selection Sort -> O(n^2)

    public static void main(String[] args) {
        int[] array = {2, 6, 876, 23, 123, 6, 989, 43, 21, 66, 22};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
//        [2, 6, 6, 21, 22, 23, 43, 66, 123, 876, 989]
    }

    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
                array[j + 1] = temp;
            }
        }
    }
}
