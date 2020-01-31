package sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: WYL
 * @create: 2020-01-31 11:20
 * 最大数
 * 输入: [10,2]
 * 输出: 210
 * 输入: [3,30,34,5,9]
 * 输出: 9534330
 **/
public class NO179 {
    public String largestNumber(int[] nums) {
        Integer [] sorted = new Integer[nums.length];
        for (int i = 0; i<nums.length; i++){
            sorted[i]=nums[i];
        }
        Arrays.sort(sorted, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int v1 = o1*nlen(o2)+o2;
                int v2 = o2*nlen(o1)+o1;
                return v2-v1;
            }
        });
        if (sorted[0]==0){
            return "0";
        }
        StringBuffer sb = new StringBuffer();
        for (int s : sorted){
            sb.append(s);
        }
        return sb.toString();
    }



    public int nlen(Integer n){
        if (n==0){
            return 10;
        }
        int len = 1;
        while (n!=0){
            n = n/10;
            len = len*10;
        }
        return len;
    }

    public static void main(String[] args) {
        NO179 no = new NO179();
        System.out.println(no.largestNumber(new int[]{3,30,34,5,9}));
        System.out.println(no.largestNumber(new int[]{0,9,8,7,6,5,4,3,2,1}));
        System.out.println(no.nlen(0));
    }
}
