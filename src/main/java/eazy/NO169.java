package eazy;

/**
 * @author: WYL
 * @create: 2019-12-24 21:36
 * 多数元素
 **/
public class NO169 {

    public int majorityElement(int[] nums) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i<nums.length; i++){
            if (count==0){
                ans = nums[i];
            }
            if (nums[i]==ans){
                count++;
            }
            if (nums[i]!=ans){
                count--;
            }

        }
        return ans;
    }
}
