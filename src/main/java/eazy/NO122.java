package eazy;

/**
 * @author: WYL
 * @create: 2019-12-17 21:46
 * 买卖股票的最佳时机 II
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 **/
public class NO122 {

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i<prices.length;i++){
            if (prices[i]>prices[i-1]){
                max += prices[i]-prices[i-1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        NO122 no = new NO122();
        no.maxProfit(new int[]{1,2,3,4});
    }
}

