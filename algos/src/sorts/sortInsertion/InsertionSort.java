package sorts.sortInsertion;

public class InsertionSort {
    public static void main(String[] args){
//        Quadratic time O(n^2) , bast case is O(n)
//        small data set = ok
//        large data set = BAD
//        Less steps than Bubble Sort
        
        int array[] = {2,5,7,12,8,3,1,4,9,8};
        insertionSort(array);

        System.out.println("Insertion Sort");
        for(int i : array) {
            System.out.print(i + ", ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
