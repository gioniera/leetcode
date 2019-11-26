package eazy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: WYL
 * @create: 2019-11-18 22:12
 **/
public class NO1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int j=0;j<nums.length;j++){
            int key = target - nums[j];
            if (map.containsKey(key)){
                int pos = map.get(key);
                if (pos==j){
                    continue;
                }
                return new int[]{j,map.get(key)};
            }
        }

        return new int[]{};
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j=0;j<nums.length;j++){
            int key = target - nums[j];
            if (map.containsKey(nums[j])){
                if (map.get(nums[j])==j){
                    continue;
                }
                return new int[]{map.get(nums[j]),j};
            }
            map.put(key,j);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        NO1 no = new NO1();
        int[] nums = {3,3};
        int [] resout = no.twoSum2(nums,6);
        System.out.printf(""+resout);
    }
}
