package eazy;

/**
 * @author: WYL
 * 爬楼梯
 * @create: 2019-12-07 22:35
 **/
public class NO70 {

    /**
     * 斐波那契数列
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i<= n; i++){
            int third = first+second;
            first = second;
            second = third;
        }
        return second;
    }

    /**
     * 动态规划 用数组缓存上一轮的计算结果
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        if (n==1){
            return 1;
        }
        int a [] = new int[n+1];
        a[1]= 1;
        a[2]=2;
        for (int i = 3; i<=n; i++){
            a[i] = a[i-1]+a[i-2];
        }
        return a[n];
    }
}
