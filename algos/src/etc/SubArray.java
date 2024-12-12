package etc;

import java.util.Arrays;

public class SubArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int start = 1;
        int end = 4;

        System.out.println(Arrays.toString(sub(nums, start, end)));
    }

    public static int[] sub(int[] nums, int start, int end) {
        int[] subArr = new int[end - start];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= start && i < end) {
                subArr[j] = nums[i];
                j++;
            }
        }
        return subArr;
    }
}
