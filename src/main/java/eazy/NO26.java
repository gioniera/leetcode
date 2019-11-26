package eazy;

/**
 * @author: WYL
 * @create: 2019-11-26 19:39
 * nums = [1,1,2]
 * 2
 **/
public class NO26 {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        if (nums.length==0){
            return 0;
        }
        for (int i = 0;i<nums.length-1;i++){
            if (nums[i]!=nums[i+1]){
                length++;
                nums[length] = nums[i+1];
            }
        }
        return length+1;
    }

    public static void main(String[] args) {
        NO26 no = new NO26();
        int a[] = {1,1,2};
        int x = no.removeDuplicates(a);
    }
}
