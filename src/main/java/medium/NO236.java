package medium;

import vo.TreeNode;

/**
 * @author: WYL
 * @create: 2019-12-26 21:40
 * 二叉树的最近公共祖先
 **/
public class NO236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }else if(right==null&&left==null){
            return null;
        }else{
            return left==null?right:left;
        }

    }
}
