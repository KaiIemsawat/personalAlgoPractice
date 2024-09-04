package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] input = new int[] {3,5,4,1,6};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(input, target)));
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[] {0, 0};
        for (int i = 0; i< nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
//    public static int[] twoSum(int[] nums, int  target) {
//        int[] res = new int[] {0,0};
//        for (int i = 0; i< nums.length-1; i++) {
//                res[0] = i;
//                for (int j = i+1; j< nums.length;j++) {
//                    if (nums[i] + nums[j] == target) {
//                        res[1] = j;
//                        return res;
//                    }
//                }
//                res[0] = 0;
//            }
//        return new int[]{0,0};
//    }



}
