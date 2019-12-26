package eazy;

/**
 * @author: WYL
 * @create: 2019-12-26 22:41
 * 2的幂
 **/
public class NO231 {
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }
}
