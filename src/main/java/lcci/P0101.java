package lcci;

/**
 * @author: WYL
 * @create: 2020-02-14 16:01
 * 面试题 01.01. 判定字符是否唯一
 **/
public class P0101 {
    public boolean isUnique(String astr) {
        int c[] = new int[256];
        for (int i = 0; i<astr.length(); i++){
            c[astr.charAt(i)]+=1;
            if (c[astr.charAt(i)]>1){
                return false;
            }
        }
        return true;
    }
}
