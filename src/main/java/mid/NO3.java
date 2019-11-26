package mid;

import java.util.HashSet;

/**
 * @author: WYL
 * @create: 2019-11-19 22:16
 * 滑动窗口
 **/
public class NO3 {
    public int lengthOfLongestSubstring(String s) {
        char schar []= s.toCharArray();
        //保存字符出现次数
        int c [] = new int[256];
        //窗口左边
        int left = 0;
        int max = 0;
        //保存重复字符
        HashSet<Character> set = new HashSet<>();
        for (int i=0;i<s.length();i++){
            char temp = schar[i];
            c[temp]++;
            if (c[temp]>1){
                set.add(temp);
            }
            while (!set.isEmpty()&&left<i){
                c[schar[left]]--;
                if (set.contains(schar[left])){
                    set.remove(schar[left]);
                }
                left++;

            }
            if (i+1-left>max){
                max=i+1-left;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        NO3 no = new NO3();
        int num = no.lengthOfLongestSubstring("tmmzuxt");
        System.out.printf(""+num);
    }
}
