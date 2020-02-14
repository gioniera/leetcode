package lcci;

import java.util.Arrays;

/**
 * @author: WYL
 * @create: 2020-02-14 16:29
 * 面试题 01.02
 * 判定是否互为字符重排
 **/
public class P0102 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length()!=s2.length()){
            return false;
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for (int i = 0; i<a1.length; i++){
            if (a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }
}
