package etc.codingbat;

import java.util.Arrays;

public class Array2WithoutTen {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(withoutTen(new int[]{1, 10, 10, 2})));
    }

    static int[] withoutTen(int[] nums) {
        if (nums.length < 1) return nums;
        if (nums.length <= 1 && nums[0] != 10) {
            return nums;
        }

        int numsI = 0;
        int resI = 0;
        int j = nums.length - 1;
        int[] res = new int[nums.length];

        while (numsI < nums.length) {
            if (nums[numsI] != 10 && nums[numsI] != 0) {
                res[resI] = nums[numsI];
                resI++;
                numsI++;
            } else if (nums[numsI] == 10) {
                res[j] = 0;
                j--;
                numsI++;
            } else if (nums[numsI] == 0) {
                numsI++;
                resI++;
                continue;
            }
        }
        return res;
    }
}
