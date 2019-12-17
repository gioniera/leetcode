package eazy;

import java.util.Arrays;

/**
 * @author: WYL
 * @create: 2019-12-17 16:16
 * 反转字符串中的单词 III
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 **/
public class NO557 {
    public String reverseWords(String s) {
        String[] x = s.split(" ");
        for (int i = 0 ; i<x.length; i++){
            char[] xchar = x[i].toCharArray();
            int length = xchar.length-1;
            for (int j = 0;j<xchar.length/2;j++){
                char tmp = xchar[j];
                xchar[j] = xchar[length];
                xchar[length]=tmp;
                length--;

            }
            x[i]=String.valueOf(xchar);
        }
       return Arrays.toString(x);
    }

}
