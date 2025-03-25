package rohit.LTcode;

import java.util.Arrays;

public class Lt1 {
        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j}; // Found the pair
                    }
                }
            }
            return new int[]{}; // Should never reach here
        }

    public static void main(String[] args) {
        int[] test= twoSum(new int[]{1, 2, 3, 4}, 6);
        System.out.println(Arrays.deepToString(new int[][]{test}));
    }

}
