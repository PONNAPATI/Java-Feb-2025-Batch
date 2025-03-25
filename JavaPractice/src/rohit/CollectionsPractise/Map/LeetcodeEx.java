package rohit.CollectionsPractise.Map;

import java.util.HashMap;
import java.util.Map;

public class LeetcodeEx {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if ((hm.containsKey(temp))) {
                return new int[]{hm.get(temp), i};
            }
        }

        return new int[]{};
    }
}
