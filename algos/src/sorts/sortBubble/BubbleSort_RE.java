package sorts.sortBubble;

import org.w3c.dom.ls.LSOutput;

public class BubbleSort_RE {

    public static void main(String[] args) {
//        Quadratic time O(n^2)
//        small data set = just ok
//        large data set = BAD

        int array[] = { 2, 1, 12, -3, 7, 8, 3, 1, 4, 9, 8, 1, 12, 43, 3, 23 };

        bubbleSorting(array);
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
    private static void bubbleSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
