package medium;

/**
 * @author: WYL
 * 最长回文子串
 * @create: 2019-12-02 19:24
 **/
public class NO5 {

    /**
     * 动态规划法 只要一个字符串f(i,j)是回文串 那么f(i-1,j-1)一定也是回文串
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s.length()<2){
            return s;
        }
        int max = 0;
        int left = 0;
        int right = 0;
        boolean dbf[][] = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++){
            for (int j = i; j>=0; j--){
               if (i==j){
                   dbf[i][j]=true;
               }else  if (j==i-1){
                   dbf[i][j]=s.charAt(i)==s.charAt(j)?true:false;
               }else {
                   dbf[i][j]=dbf[i-1][j+1]&&s.charAt(i)==s.charAt(j)?true:false;
               }
               if (dbf[i][j]&&max<i-j+1){
                   max = i-j+1;
                   left = j;
                   right = i;
               }
            }
        }

        return s.substring(left,right+1);
    }


    /**
     * 扩展法 选定一个中间值 忘两边扩展 回文数可能是长度可能是基数可能是偶数
     * @param s
     * @return
     */
    public String longestPalindrome2(String s) {
        if (s.length()<2){
            return s;
        }
        int max = 0;
        int left = 0;
        int right = 0;
        int a[] = new int[2];
        for (int i = 0; i<s.length(); i++){
            a = expand(s,i,i);
            if (max<a[1]-a[0]+1){
                max = a[1]-a[0]+1;
                left = a [0];
                right = a[1];
            }
            a = expand(s,i,i+1);
            if (max<a[1]-a[0]+1){
                max = a[1]-a[0]+1;
                left = a [0];
                right = a[1];
            }
        }

        return s.substring(left,right+1);
    }

    public int[] expand(String s , int left, int right){
        while (left>=0&&right<s.length()){
            if (s.charAt(left)!=s.charAt(right)){
                break;
            }
            left--;
            right++;
        }
        return new int[]{++left,--right};
    }
    public static void main(String[] args) {
        NO5 no = new NO5();
        System.out.println(no.longestPalindrome2("12345432"));
    }
}
