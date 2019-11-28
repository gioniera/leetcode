package eazy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: WYL
 * @create: 2019-11-27 22:27
 *
 * 执行用时 :8 ms, 在所有 java 提交中击败了 83.17% 的用户
 * 内存消耗 : 44.4 MB, 在所有 java 提交中击败了83.28% 的用户
 **/
public class NO217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for (int i : nums){
            if (!res.add(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,1};
        NO217 no = new NO217();
        no.containsDuplicate(a);
    }
}
