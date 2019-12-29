package medium;

import vo.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author: WYL
 * @create: 2019-12-29 22:24
 * 二叉搜索树中第K小的元素
 **/
public class NO230 {
    /**
     * 递归
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        int leftNum = getLeafNum(root.left)+1;
        if (k==leftNum){
            return root.val;
        }
        if (k<leftNum){
            return kthSmallest(root.left,k);
        }
        if (k>leftNum){
           return kthSmallest(root.right,k-leftNum);
        }
        return root.val;
    }

    public int getLeafNum(TreeNode root){
        if (root==null){
            return 0;
        }
        return getLeafNum(root.left)+getLeafNum(root.right)+1;
    }
}
