package lcci;

/**
 * @author: WYL
 * @create: 2020-03-02 19:33
 * 面试题 01.03. URL化
 **/
public class P0103 {
    public String replaceSpaces(String S, int length) {
        char[] s = S.toCharArray();
        int spaceLength = 0;

        for (int i = 0; i < length; i++) {
            if (s[i] == ' ') {
                spaceLength++;
            }
        }
        int trueLength = length + spaceLength * 2;
        char[] arr = new char[trueLength];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (s[i]==' '){
                arr[j++]='%';
                arr[j++]='2';
                arr[j++]='0';
            }else {
                arr[j++]=s[i];
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println("Mr John Smith    ".length());
    }
}

