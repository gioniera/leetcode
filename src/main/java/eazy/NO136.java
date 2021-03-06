package eazy;

/**
 * @author: WYL
 * @create: 2019-12-17 11:38
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 只出现一次的数字
 * 输入: [2,2,1]
 * 输出: 1
 **/
public class NO136 {
    /**
     * 异或运算 ：0^0=0；   0^1=1；   1^0=1；   1^1=0；
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int  result = nums[0];
        for (int i = 1;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }
}
