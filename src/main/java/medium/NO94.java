package medium;

import vo.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: WYL
 * @create: 2020-01-01 12:53
 * 二叉树的中序遍历
 **/
public class NO94 {
    /**
     * 递归
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        recursionMiddleorderTraversal(ans,root);
        return ans;
    }

    public void recursionMiddleorderTraversal(List<Integer> ans, TreeNode root){
        if (root != null) {
            recursionMiddleorderTraversal(ans,root.left);
            ans.add(root.val);
            recursionMiddleorderTraversal(ans,root.right);
        }
    }


    public static void recursionPreorderTraversal(TreeNode root) {
        if (root != null) {
            recursionPreorderTraversal(root.left);
            recursionPreorderTraversal(root.right);
            System.out.print(root.val + " ");
        }
    }

}
