package lcci;

/**
 * @author: WYL
 * @create: 2020-03-04 17:59
 * 面试题 01.05. 一次编辑
 **/
public class P0105 {
    public boolean oneEditAway(String first, String second) {

        int firstLength = first.length();
        int sencondLength = second.length();
        if (Math.abs(sencondLength - firstLength) > 1) {
            return false;
        }

        int i = 0;
        int j = 0;
        int count = 0;
        while (i < firstLength && j < sencondLength) {
            if (first.charAt(i) == second.charAt(j)) {
                i++;
                j++;
            } else if (i + 1 < firstLength && first.charAt(i + 1) == second.charAt(j)) {
                i++;
                count++;
            } else if (j + 1 < sencondLength && first.charAt(i) == second.charAt(j + 1)) {
                j++;
                count++;
            } else {
                i++;
                j++;
                count++;
            }
        }

        return count + Math.abs(firstLength - i) + Math.abs(sencondLength - j) < 2;
    }
}
