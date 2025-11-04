package etc.codingbat;

import java.util.Arrays;

public class Array2NotAlone {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(notAlone(new int[]{1, 1, 1, 2}, 2)));
    }

    static int[] notAlone(int[] nums, int val) {
        if (nums.length <= 2) return nums;
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i-1] > nums[i+1] && nums[i-1] != val && nums[i+1] != val) {
                nums[i] = nums[i-1];
            } else if (nums[i-1] < nums[i+1] && nums[i - 1] != val && nums[i+1] != val) {
                nums[i] = nums[i+1];
            }
        }
        return nums;
    }
}
