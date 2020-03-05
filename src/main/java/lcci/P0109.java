package lcci;

import com.sun.tools.javac.util.StringUtils;

/**
 * @author: WYL
 * @create: 2020-03-04 23:38
 * 面试题 01.09. 字符串轮转
 **/
public class P0109 {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length()!=s2.length()){
            return false;
        }
        String s1s1 = s1 + s1;
        return s1s1.contains(s2);
    }
}
