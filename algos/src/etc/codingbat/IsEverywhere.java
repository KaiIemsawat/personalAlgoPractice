package etc.codingbat;

public class IsEverywhere {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3};
        int val = 2;
        System.out.println(isEverywhere(nums, val));
    }

    public static boolean isEverywhere(int[] nums, int val) {
        boolean isIt = false;
        if (nums.length <= 1) return true;
        int i = 0;
        if (nums.length == 2 && (nums[i] == val || nums[i + 1] == val)) return true;
        if (nums.length % 2 == 0) {
            while (i < nums.length - 2) {
                if (nums[i] != nums[i + 2]) {
                    isIt = false;
                    i++;
                } else if (nums[i] == nums[i + 2]) {
                    isIt = true;
                    i += 2;
                }
            }
            return isIt;
        } else {
            i = 1;
            while (i < nums.length - 2) {
                if (nums[i] != nums[i + 2]) {
                    isIt = false;
                    return isIt;
                } else if (nums[i] == nums[i + 2]) {
                    isIt = true;
                    i += 2;
                }
            }
        }
        return isIt;
    }

}
