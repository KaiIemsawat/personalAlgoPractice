public class BinarySearch {

    public static void main(String[] args) {
        /* ===== Binary Search ===== */
//        Array need to be sorted
//        Half of the array will be divided and eliminate each step
        int[] ints = {1, 2, 4, 5, 7, 9, 11, 12, 23, 25, 32, 34, 47, 49, 53, 54, 55, 62,  68, 69};
        int target = 9;
        System.out.println("the index of the number is : " + binarySearch(ints, target));
    }

    private static int binarySearch(int[] numArr, int numberToFind) {
        int low = 0;
        int high = numArr.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = numArr[middlePosition];

//            this line just for observation. Doesn't need to be here
            System.out.println("the current middle position (index) is : " + middlePosition);

//            If the number to find is happen to be in the middle
            if (numberToFind == middleNumber) {
                return middlePosition;
            }
//            If the number is less than the middle number
            if (numberToFind < middleNumber) {
                high = middlePosition - 1;
            }
//            If the number is greater than the number in the middle
            else {
                low = middlePosition + 1;
            }
        }
//        If the number is not in the array
        return -1;
    }
}
