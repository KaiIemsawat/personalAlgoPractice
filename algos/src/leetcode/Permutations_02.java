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
            int[] nums, boolean[] used, ArrayList<Integer> perms, List<List<Integer>> result
    ) {
        if (perms.size() == nums.length) {
            result.add(new ArrayList<>(perms));
            return;
        }

        for (int i = 0; i< nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            perms.add(nums[i]);
            permutation(nums, used, perms, result);
            used[i] = false;
            perms.remove(perms.size() - 1);
        }
    }
}
