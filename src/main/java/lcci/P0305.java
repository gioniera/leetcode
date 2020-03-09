package lcci;

import java.util.Stack;

/**
 * @author: WYL
 * @create: 2020-03-08 18:33
 * 面试题 03.05. 栈排序
 **/
public class P0305 {
    class SortedStack {
        private Stack<Integer> data;
        private Stack<Integer> help;

        public SortedStack() {
            this.data = new Stack<>();
            this.help = new Stack<>();
        }

        public void push(int val) {
            if (!data.isEmpty() && val > data.peek()) {
                while (!data.isEmpty()&& val>data.peek()){
                    Integer tmp = data.peek();
                    data.pop();
                    help.push(tmp);
                }
                data.push(val);
                while (!help.isEmpty()){
                    Integer tmp = help.peek();
                    help.pop();
                    data.push(tmp);
                }

            } else {
                data.push(val);
            }
        }

        public void pop() {
            if (!data.isEmpty()){
                data.pop();
            }else {
                return ;
            }
        }

        public int peek() {
            if (!data.isEmpty()){
                return data.peek();
            }else {
                return -1;
            }
        }

        public boolean isEmpty() {
            return data.isEmpty();
        }
    }
}
