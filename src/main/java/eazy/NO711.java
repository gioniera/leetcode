package eazy;

/**
 * @author: WYL
 * @create: 2019-11-15 23:52
 **/
public class NO711 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] charJ = J.toCharArray();
        char[] charS = S.toCharArray();
        for (char c : charJ){
            for (char s : charS){
                if (s==c){
                    count++;
                }
            }
        }
        return count;
    }
}
