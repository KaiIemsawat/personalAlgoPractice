package searchs.searchLinear_re;

public class LinearSearchDemo {

    public static void main(String[] args) {

        // linear search = iterate through a collection on element at a time

        int[] array = {3,4,7,8,4,1,4,74,3,13,5};
        int index = linearSearch(array, 1);

        System.out.println(index);
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
