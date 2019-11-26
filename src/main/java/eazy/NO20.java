package eazy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * @author: WYL
 * @create: 2019-11-21 21:57
 **/
public class NO20 {

    public boolean isValid(String s) {
        char[] schar = s.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack();
        for (int i =0; i<s.length();i++){
            if (map.containsKey(schar[i])){
                stack.push(schar[i]);
                continue;
            }
            if (!stack.empty()){
                Character c = stack.pop();
                if (map.get(c)==schar[i]){
                    continue;
                }
            }
            return false;
        }
        return stack.size()==0;
    }

    public static void main(String[] args) {
        NO20 no = new NO20();
        boolean re = no.isValid("");
        System.out.printf(""+re);
    }
}
