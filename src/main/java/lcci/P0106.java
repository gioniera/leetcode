package lcci;

/**
 * @author: WYL
 * @create: 2020-03-04 18:51
 * 面试题 01.06. 字符串压缩
 **/
public class P0106 {
    public String compressString(String S) {
        if (S.length() == 0) {
            return S;
        }
        StringBuffer sb = new StringBuffer();
        int count = 1;
        char a = S.charAt(0);
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == a) {
                count++;
                continue;
            }
            sb.append(a);
            sb.append(count);
            a = S.charAt(i);
            count = 1;
        }
        sb.append(a);
        sb.append(count);
        return sb.length() < S.length() ? new String(sb) : S;
    }
}
