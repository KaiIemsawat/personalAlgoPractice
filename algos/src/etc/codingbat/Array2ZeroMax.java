package etc.codingbat;

import java.util.Arrays;

public class Array2ZeroMax {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(zeroMax(new int[] {0, 5, 0, 3})));
    }

    static int[] zeroMax(int[] nums) {
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 1 && nums[j] > temp) {
                        temp = nums[j];
                    }
                }
                nums[i] = temp;
                temp = 0;
            }
        }
        return nums;
    }
}
