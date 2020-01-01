package medium;

import vo.TreeNode;


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

    /**
     * 中序遍历
     * @param root
     * @param k
     * @return
     */
    int curk;
    public int kthSmallest2(TreeNode root, int k) {
        root = recursionMiddleorderTraversal(root,k);
        return root.val;
    }
    public TreeNode recursionMiddleorderTraversal(TreeNode node, int k){
        TreeNode ret = null;
        if (node!=null){
            ret = recursionMiddleorderTraversal(node.left, k);
            if (ret != null) {
                return ret;
            }
            curk++;
            if (curk==k){
                return node;
            }
            ret = recursionMiddleorderTraversal(node.right,k);
        }
        return ret;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        NO230 no = new NO230();
        System.out.println(no.kthSmallest2(root,6));
    }
}
