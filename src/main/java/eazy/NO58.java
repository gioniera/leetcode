package eazy;

/**
 * @author: WYL
 * @create: 2019-11-21 22:51
 **/
public class NO58 {
    public int lengthOfLastWord(String s) {
        String[] sArr = s.split("\\s");
        if (sArr.length>=1){
            return sArr[sArr.length-1].length();
        }else {
            return 0;
        }
    }


    public int lengthOfLastWord2(String s) {
        char[] schar = s.toCharArray();
        int length = 0;
        for (int i = s.length()-1;i>=0;i--){
            if (schar[i]==' '&& length >0){
                return length;
            }
            if (schar[i]!=' '){
                length++;
            }

        }
        return length;
    }

    public static void main(String[] args) {
        NO58 no = new NO58();
        int x = no.lengthOfLastWord2("H ");
        System.out.println(x);
    }
}
