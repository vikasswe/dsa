package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 10, 11, 15, 7};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println(map + "===================> ");

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];
            System.out.println("complement =====> " + complement+ "index=========>" + i + "nums[i] ========> " + nums[i]);

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}