package lcci;

import java.util.Arrays;

/**
 * @author: WYL
 * @create: 2020-03-02 19:44
 * 面试题 01.04. 回文排列
 **/
public class P0104 {
    public boolean canPermutePalindrome(String s) {
        int length = s.length();
        int[] table = new int[256];
        for (int i = 0; i < length; i++) {
            table[s.charAt(i)]+=1;
        }
        boolean flag = false;
        for (int x : table) {
            if (x % 2 == 1) {
                if (flag) {
                    return false;
                }
                flag = true;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        P0104 p = new P0104();
        p.canPermutePalindrome("code");
    }
}
