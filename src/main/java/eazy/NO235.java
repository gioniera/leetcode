package eazy;

import vo.TreeNode;

/**
 * @author: WYL
 * 二叉搜索树, 找到该树中两个指定节点的最近公共祖先
 * @create: 2019-12-11 19:46
 **/
public class NO235 {
    /**
     * 迭代法
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pval = p.val;
        int qval = q.val;
        TreeNode node = root;
        while (node != null){
            int parentVal = node.val;
            if (pval>parentVal&&qval>parentVal){
                node = node.right;
            }else if (pval<parentVal&&qval<parentVal){
                node = node.left;
            }else {
                return node;
            }
        }
        return null;
    }

    /**
     * 递归
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;
        int pval = p.val;
        int qval = q.val;

        if (pval>parentVal&&qval>parentVal){
            return lowestCommonAncestor1(root.right,p,q);
        }else if (pval<parentVal&&qval<parentVal){
            return lowestCommonAncestor1(root.left,p,q);
        }else {
            return root;
        }
    }
}
