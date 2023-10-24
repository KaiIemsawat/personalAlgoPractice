package sortBubble;

public class BubbleSort {
    public static void main(String[] args) {
//        Quadratic time O(n^2)
//        small data set = just ok
//        large data set = BAD

        int array[] = {2,5,7,8,3,1,4,9,8};
        bubbleSort(array);

        System.out.println("Bubble Sort");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int array[]) {
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
