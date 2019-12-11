package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: WYL
 * 三数之和
 * @create: 2019-12-10 20:27
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 **/
public class NO15 {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        if (nums==null||nums.length<3){
            return list;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if(nums[i] > 0) break;
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int first = i+1;
            int last = nums.length-1;
            while (first<last){
                int result = nums[i] + nums[first] + nums[last];
                if (result == 0){
                    list.add( Arrays.asList(nums[i],nums[first],nums[last]));
                    while (first<nums.length-1&&nums[first]==nums[first+1]){
                        first++;
                    }
                    while (last>0&&nums[last]==nums[last-1]){
                        last--;
                    }
                    first++;
                    last--;
                    continue;
                }
                if (result<0){
                    first++;
                    continue;
                }
                if (result>0){
                    last--;
                    continue;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        NO15 no = new NO15();
        no.threeSum(new int[]{0,0,0});
    }
}
