package eazy;

/**
 * @author: WYL
 * @create: 2019-11-24 22:17
 **/
public class NO66 {

    public static int[] plusOne(int[] digits) {
        for (int i =digits.length-1 ; i>=0; i--){
            digits[i]+=1;
            //不需要进位就直接返回当前数组
            if (digits[i]==10){
                //需要进位当前位为零下一位加一
                digits[i]=0;
                //循环到第一位 需要进位则new一个长度加一的数组 999情况
                if (i==0){
                    int a[]=new int[digits.length+1];
                    a[i]=1;
                    return a;
                }
                continue;
            }

            break;
        }
        return digits;
    }

    public static void main(String[] args) {
        int a[] = {9,8,7,6,5,4,3,2,1,0};
//        int[] x = plusOne(a);
        System.out.println(11%10);
    }
}
