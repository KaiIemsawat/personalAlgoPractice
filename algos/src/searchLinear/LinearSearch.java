package searchLinear;

public class LinearSearch {
    public static void main(String[] args) {
//        runtime complexity : O(n)

//        PROS
//        Fast for search of small to medium data sets
//        Does not need to sorted
//        Useful for data structures that do not have random access (Such as Linked List)

//        CONS
//        Slow for large data sets

        int array[] = {15,7,2,-3,82,4,9,5,2,11,-5};

        int index = linearSearch(array, 2);

        if (index != -1) {
            System.out.println("Element found at index : " + index);
        }
        else {
            System.out.println("Element not found");
        }
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
