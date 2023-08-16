import java.util.Arrays;

public class BubbleSort {
    /* ===== Bubble Sort ===== */
//    Pairs of adjacent elements are compared,
//    the element are swapped if not in order

//    Quadratic time = O(n^2)
//    Very slow - inefficient

    public static void main(String[] args) {
        int[] array = {2, 6, 876, 23, 123, 6, 989, 43, 21, 66, 22, 543, 21, 867, 76, 34};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for (int i =0; i < array.length - 1; i++) {
            for(int j=0; j< array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
