package eazy;

import vo.ListNode;

/**
 * @author: WYL
 * @create: 2019-12-18 23:27
 * 最大子序和
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 **/
public class NO53 {

    /**
     * 贪心算法
     * 在i处的最大和是i-1处的最大和加num[i] 遍历完每一处的最大和中最大的就是答案
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i<nums.length; i++){
            if (nums[i]+currentSum>nums[i]){
                currentSum = nums[i]+currentSum;
            }else {
                currentSum = nums[i];
            }
            if (currentSum>max){
                max = currentSum;
            }
        }
        return max;
    }

    /**
     * 动态规划
     * 正数的增益效果
     * 就如果num[i]前的sum是负数，这个sum就只是一个拖累
     * 假设在i处之前的sum值是负数，就让sum值等于nums[i],是正数就sum = sum+nums[i]
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        int sum = nums[0];
        int ans = 0;
        for (int i = 0 ; i<nums.length; i++){
            if (sum>0){
                sum +=nums[i];
            }else {
                sum = nums[i];
            }
            if (sum>ans){
                ans = sum;
            }
        }
        return ans;
    }

}
