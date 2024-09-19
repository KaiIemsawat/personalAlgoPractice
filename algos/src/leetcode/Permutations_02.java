package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations_02 {
    public static void main(String[] args) {
        int[] inputNums = {1, 2, 3};

        System.out.println(permute(inputNums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }

    private static void permutation(
            int[] nums, // Take base input array (original)
            boolean[] used, // Check if the index was used
            ArrayList<Integer> innerArray, // The smaller array (inner dimension array).
            List<List<Integer>> result
    ) {

        // Once innerArray has the same size with original input array,
        // add innerArray to result array
        if (innerArray.size() == nums.length) {
            result.add(new ArrayList<>(innerArray));
            return;
        }

        // Iterate through all elements based on 'nums'
        for (int i = 0; i< nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            innerArray.add(nums[i]);
            permutation(nums, used, innerArray, result);
            used[i] = false;
            innerArray.remove(innerArray.size() - 1);
        }
    }
}
