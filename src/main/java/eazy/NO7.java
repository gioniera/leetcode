package eazy;

/**
 * @author: WYL
 * @create: 2019-12-03 20:27
 * 整数反转
 **/
public class NO7 {

    public int reverse(int x) {
        long n = 0;
        int tmp = x;
        while (tmp!=0){
            n = n*10+tmp%10;
            tmp = tmp/10;
        }
        return (n<Integer.MIN_VALUE || n>Integer.MAX_VALUE) ? 0: (int)n;
    }

    public static void main(String[] args) {
        NO7 no = new NO7();
        int x = no.reverse(1234567891);
        System.out.println(x);
    }
}
