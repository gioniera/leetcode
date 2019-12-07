package eazy;

/**
 * @author: WYL
 * 最长公共前缀
 * @create: 2019-12-07 20:32
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 **/
public class NO14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        char a[] = strs[0].toCharArray();
        for (int i = 0 ; i <a.length; i++){
            for (int j = 1;j<strs.length;j++){
                if (i == strs[j].length() || a[i]!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }

        return strs[0];
    }

    public static void main(String[] args) {
        String a[]  = new String[]{"f","f","f"};
        NO14 no = new NO14();
        String x = no.longestCommonPrefix(a);

        System.out.println(x);
    }
}
