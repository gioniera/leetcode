package eazy;

/**
 * @author: WYL
 * 回文数
 * @create: 2019-12-02 19:50
 **/
public class NO9 {
    public boolean isPalindrome(int x) {
        int n = 0;
        int tmp = x;
        while (tmp>0) {
            n = n * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        if (x==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        NO9 no = new NO9();
        no.isPalindrome(121);
        System.out.println(121/10);
        System.out.println(121%10);
        System.out.println(121%10);
        System.out.println(1/10);
    }
}
