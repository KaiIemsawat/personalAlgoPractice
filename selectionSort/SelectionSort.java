
import java.util.Arrays;

public class SelectionSort {
    /* ===== Selection Sort ===== */
//    search through an array and keep track of the minimum value during each iteration.
//    At the end of each iteration, swap variables

//    Quadratic time = O(n^2)
    public static void main(String[] args) {
        int[] numArr = {12, 4, 765, 34, 123, 3, 65, 4, 786, 54,12, 345, 434, 122};
        System.out.println(Arrays.toString(numArr));
        selectionSort(numArr);
        System.out.println(Arrays.toString(numArr));
    }

    private static void selectionSort(int[] numArr) {
        for (int i=0; i<numArr.length - 1; i++) {
            int min = i;
            for(int j = 1 + 1; j < numArr.length; j++) {
                if(numArr[min] > numArr[j]) {
                    min = j;
                }
            }
            int temp = numArr[i];
            numArr[i] = numArr[min];;
            numArr[min] = temp;
        }
    }
}
