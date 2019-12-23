package eazy;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author: WYL
 * @create: 2019-12-22 18:36
 * 最小栈
 **/
public class MinStack {
    private Stack<Integer> data;
    private int top ;
    private PriorityQueue<Integer> queue;
    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<>();
        top = -1;
        queue = new PriorityQueue<>();
    }

    public void push(int x) {
        data.push(x);
        queue.add(x);
    }

    public void pop() {
        Integer x = data.pop();
        queue.remove(x);
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return queue.peek();
    }
}

