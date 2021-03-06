package leetcode.editor.cn;

import java.util.HashMap;

/**
 * 题目名字---:两数之和
 * 题目编号---:1
 * 解题时间---:2022-06-20 11:35:48
 */

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        solution.twoSum(null, 3);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (hashMap.containsKey(target - nums[i])) {
                    return new int[]{hashMap.get(target - nums[i]), i};
                }
                hashMap.put(nums[i], i);
            }
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}