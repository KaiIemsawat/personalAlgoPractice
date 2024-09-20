package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet70_ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }


    // Much like Fibonacci without the first few steps
    public static int climbStairs(int n) {
        if (n <=2 ) return n;

        List<Integer> nums = new ArrayList<>(Arrays.asList(0, 1, 1, 2));

        for (int i = 3; i<=n; i++) {
            nums.add(nums.get(nums.size()-1) + nums.get(nums.size()-2));
        }
        return nums.get(nums.size()-1);
    }
}
