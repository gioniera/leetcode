package eazy;

/**
 * @author: WYL
 * @create: 2020-01-06 21:34
 * 验证回文串
 **/
public class NO126 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        if (s.length()==0||s==null){
            return true;
        }
        int left = 0;
        int right = s.length()-1;
        char a[] = s.toCharArray();
        while (left >= 0 && right < s.length()&&left<right) {
            if (a[left]==a[right]){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
}
