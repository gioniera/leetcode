package eazy;

import javafx.util.Pair;
import vo.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: WYL
 * 二叉树的最大深度
 * @create: 2019-12-11 21:15
 **/
public class NO104 {
    /**
     * DFS深度优先搜索
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }else {
            int lh = maxDepth(root.left);;
            int rh = maxDepth(root.right);
            return java.lang.Math.max(lh,rh)+1;
        }
    }

    /**
     * 迭代 栈
     * @param root
     * @return
     */
    public int maxDepth2(TreeNode root) {
        return 0;
    }
}
