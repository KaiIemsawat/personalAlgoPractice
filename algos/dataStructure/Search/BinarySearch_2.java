public class BinarySearch_2 {

    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,7,8,12,14,18,23,35,36,37,42,44,49};
        int target = 44;

        System.out.println(binarySearch(intArr, target));

    }

    private static int binarySearch(int[] intArr, int target) {
        int lowIdx = 0;
        int hiIdx = intArr.length - 1;
        int midIdx = lowIdx + (hiIdx - lowIdx) / 2;

        while (hiIdx >= lowIdx) {
            if (intArr[midIdx] == target) {
                return midIdx;
            } else if (intArr[midIdx] > target) {
                hiIdx = midIdx - 1;
            } else {
                lowIdx = midIdx + 1;
            }
            midIdx = lowIdx + (hiIdx - lowIdx) / 2;
        }
        return -1;
    }

}
