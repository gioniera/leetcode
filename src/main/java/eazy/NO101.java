package eazy;

import vo.TreeNode;

import java.util.LinkedList;

/**
 * @author: WYL
 * @create: 2019-12-28 20:47
 * 对称二叉树
 **/
public class NO101 {
    /**
     * 递归
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode left,TreeNode right){
        if (left==null&&right==null){
            return true;
        }
        if (left==null||right==null){
            return false;
        }
        return left.val==right.val
                &&isMirror(left.left,right.right)
                &&isMirror(left.right,right.left);
    }

    /**
     *
     * @param root
     * @return
     */
    public boolean isSymmetric2(TreeNode root) {
        LinkedList<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            TreeNode t1 = treeNodes.pop();
            TreeNode t2 = treeNodes.pop();
            if (t1==null&&t2==null){
                continue;
            }
            if (t1==null||t2==null){
                return false;
            }
            if (t1.val != t2.val){
                return false;
            }
            treeNodes.add(t1.left);
            treeNodes.add(t2.right);
            treeNodes.add(t1.right);
            treeNodes.add(t2.left);
        }

        return true;

    }
}
