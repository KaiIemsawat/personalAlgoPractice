package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDupArray {
    public static void main(String[] args) {

        int[] input = {1,2,2,3,4,5,5,5,6,7};
        System.out.println(removeDuplicates(input));

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res;
        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);

        for (int i = 1; i< nums.length-1; i++) {
            if (nums[i] != nums[i+1] && nums[i] != temp.get(temp.size()-1) ) {
                temp.add(nums[i]);
            }
            else if (nums[i] == nums[i+1] && nums[i] != temp.get(temp.size()-1)) {
                temp.add(nums[i]);
                i++;
            }
        }
            if (nums[nums.length - 1] != temp.get(temp.size() - 1)) {
                temp.add((nums[nums.length - 1]));
            }
        res = temp.size();

        return res;
    }
}

/* NOTE */
// Due to the unclear of requirement, This is not the result they expected. But it's correct according to what stated on requirement