package sorts.sortBubble;

public class BubbleSort_RE2 {
    public static void main(String[] args) {
//        Quadratic time O(n^2)
//        small data set = just ok
//        large data set = BAD

        int array[] = { 2, 1, 12, -3, 7, 8 };

        bubbleSorting(array);
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
//    -3, 1, 2, 7, 8, 12,
//    -3, 1, 2, 7, 8, 12,
    private static void bubbleSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j+1] < array[j]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
