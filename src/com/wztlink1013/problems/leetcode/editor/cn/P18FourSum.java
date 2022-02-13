package com.wztlink1013.problems.leetcode.editor.cn;

// todo: P18.四数之和
// P18.4sum
//给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c +
// d 的值与 target 相等？找出所有满足条件且不重复的四元组。 
//
// 注意： 
//
// 答案中不可以包含重复的四元组。 
//
// 示例： 
//
// 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
//
//满足要求的四元组集合为：
//[
//  [-1,  0, 0, 1],
//  [-2, -1, 1, 2],
//  [-2,  0, 0, 2]
//]
// 
// Related Topics 数组 哈希表 双指针 
// 👍 687 👎 0

import java.util.ArrayList;
import java.util.List;

public class P18FourSum{
    public static void main(String[] args) {
        Solution solution = new P18FourSum().new Solution();
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        result = solution.fourSum(nums, target);


        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i<nums.length; i++) {
            int temp_1 = target - nums[i];
            for (int j = 1; j<nums.length ; j++) {
                int temp_2 = temp_1 - nums[j];
                for (int k = 2; k<nums.length; k++) {
                    int temp_3 = temp_2 - nums[k];
                    for (int l = 3;l<nums.length;l++) {
                        if (temp_3 == nums[l]) {
                            List<Integer> list_temp = new ArrayList<>();
                            list_temp.add(nums[i]);
                            list_temp.add(nums[j]);
                            list_temp.add(nums[k]);
                            list_temp.add(nums[l]);
                            list.add(list_temp);
                        }
                        break;
                    }
                }
            }
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}