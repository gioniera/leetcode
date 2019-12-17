package eazy;

/**
 * @author: WYL
 * @create: 2019-12-17 20:48
 * 买卖股票的最佳时机
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 **/
public class NO121 {
    /**
     * 暴力法
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i<prices.length; i++){
            for (int j = i+1;j<prices.length;j++){
                int p = prices[j] - prices[i];
                if (p>max){
                    max = p;
                }
            }

        }
        return max;
    }


    /**
     * bp 记录最大值和最小值
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        if (prices.length<0){
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 1; i<prices.length; i++){
            if (prices[i]-min>max){
                max = prices[i]-min;
            }else if(min>prices[i]){
                min = prices[i];
            }
        }

        return max;
    }
}
