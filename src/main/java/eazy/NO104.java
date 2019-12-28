package eazy;

import vo.TreeNode;

import java.util.concurrent.ConcurrentLinkedDeque;

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
    public int maxDepth(String str, TreeNode root) {
        if (root==null){
            System.out.println(str+"null");
            return 0;
        }else {
            System.out.println(str+"root=" + root.val + "   01");
            int lh = maxDepth(str+"\t", root.left);
            System.out.println(str+"root=" + root.val + "   02");
            int rh = maxDepth(str+"\t", root.right);
            System.out.println(str+"root=" + root.val + "   03");
            return java.lang.Math.max(lh,rh)+1;
        }
    }

    public  int dfsSum(TreeNode root){
        int sum = root.val;
        if (root.left!=null){
            sum += dfsSum(root.left);
        }
        if (root.right!=null){
            sum += dfsSum(root.right);
        }
        return sum;
    }

    public int bfsSum(TreeNode root){
        int sum = 0;
        ConcurrentLinkedDeque<TreeNode> treeNodes = new ConcurrentLinkedDeque<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            TreeNode node = treeNodes.pop();
            sum += node.val;
            if (node.left!=null){
                treeNodes.add(node.left);
            }
            if (node.right!=null){
                treeNodes.add(node.right);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode left2 = new TreeNode(2);
        TreeNode right2 = new TreeNode(3);
        TreeNode left3 = new TreeNode(2);
        TreeNode right3 = new TreeNode(3);
        root.left = left1;
        root.right = right1;
//        left1.left=left2;
//        left1.right=right2;
//        right1.left=left3;
//        right1.right=right3;
        NO104 no = new NO104();
//        no.maxDepth("", root);
//        no.dfsSum(root);
        System.out.println(no.bfsSum(root));
    }
}
