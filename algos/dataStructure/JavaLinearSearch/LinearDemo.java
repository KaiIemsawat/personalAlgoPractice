public class LinearDemo {
    public static void main(String[] args) {
        int[] array = {2,4,5,2,6,85,21,34,587,2,12,11,2,9};
        int index = linearSearch(array, 2);
        if(index != -1) {
            System.out.println("Element found at index : " + index);
        } else System.out.println("Element not found");
    }

    private static int linearSearch(int[] arr, int value) {
        for (int i=0 ; i< arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
