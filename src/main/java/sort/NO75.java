package sort;

/**
 * @author: WYL
 * @create: 2020-01-30 13:26
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 **/
public class NO75 {
    public void sortColors(int[] nums) {
        int count[] = new int[2];
        for (int i = 0; i<nums.length; i++){
            count[nums[i]]++;
        }
        for (int i = 0; i<nums.length; i++){
            if (i<count[0]){
                nums[i]=0;
            }else if (i<count[0]+count[1]){
                nums[i]=1;
            }else {
                nums[i]=2;
            }
        }

    }
}
