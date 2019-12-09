package eazy;

/**
 * @author: WYL
 * @create: 2019-12-09 19:32
 * 输入：["h","e","l","l","o","x"]
 * 输出：["x","o","l","l","e","h"]
 **/
public class NO344 {
    public void reverseString(char[] s) {
        int i = 0;
        int k = s.length-1;
        if (s.length%2==0){
           while (k!=i-1){
               char tmp = s[i];
               s[i] = s[k];
               s[k] = tmp;
               i++;
               k--;
           }
        }
        if (s.length%2==1){
            while (k!=i){
                char tmp = s[i];
                s[i] = s[k];
                s[k] = tmp;
                i++;
                k--;
            }
        }

    }

    public static void main(String[] args) {
        char [] s = new char[]{'h','e','l','l','o'};
        NO344 no = new NO344();
        no.reverseString(s);
        System.out.println(s);
    }
}
