package eazy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: WYL
 * @create: 2019-12-21 19:05
 * 最接近的三数之和
 **/
public class NO16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i<3; i++){
            ans += nums[i];
        }
        for (int i = 0; i<nums.length; i++){
            int end = nums.length-1;
            int start = i+1;
            while (start<end){
                int sum = nums[start]+nums[i]+nums[end];
                if (Math.abs(target-sum)<Math.abs(target-ans)){
                    ans = sum;
                }
                if (sum < target){
                    start++;
                }else if (sum > target){
                    end--;
                }else {
                    return ans;
                }
            }
        }
        return ans;

    }
}
