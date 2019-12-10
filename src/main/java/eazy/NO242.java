package eazy;

import java.util.Arrays;

/**
 * @author: WYL
 * 有效的字母异位词
 * @create: 2019-12-10 20:14
 **/
public class NO242 {
    public boolean isAnagram(String s, String t) {
        char[] schar = s.toCharArray();
        Arrays.sort(schar);
        char[] tchar = t.toCharArray();
        Arrays.sort(tchar);
        if (schar.length==tchar.length){
            for (int i = 0; i < tchar.length;i++){
                if (schar[i]!=tchar[i]){
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}
