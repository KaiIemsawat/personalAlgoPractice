package sorts.sortInsertion;

public class InsertionSort_RE {
    public static void main(String[] args){
//        Quadratic time O(n^2) , bast case is O(n)
//        small data set = ok
//        large data set = BAD
//        Less steps than Bubble Sort

        int array[] = {2,5,7,12,8,-3,1,4,9,8,0,12,24};
        insertionSort(array);

        System.out.println("Insertion Sort");
        for(int i : array) {
            System.out.print(i + ", ");
        }
    }
    //-3, 0, 1, 2, 4, 5, 7, 8, 8, 9, 12, 12, 24,
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tempValue = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > tempValue) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = tempValue;
        }
    }

}
