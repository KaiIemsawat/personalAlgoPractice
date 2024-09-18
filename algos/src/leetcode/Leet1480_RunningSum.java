package leetcode;

import java.util.Arrays;

public class Leet1480_RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    /*
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */

    public static int[] runningSum(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int[] res = new int[nums.length];
        res[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i] + res[i-1];
        }
        return res;
    }
}
