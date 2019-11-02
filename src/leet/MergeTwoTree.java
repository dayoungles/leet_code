package leet;

import leet.model.TreeNode;

public class MergeTwoTree {
    TreeNode result;

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        int left = 0;
        int right = 0;

        if (t1!= null){
            left = t1.val;
        }
        if (t2!= null){
            right = t2.val;
        }

        TreeNode parent = new TreeNode(left + right);

        parent.left = mergeTrees(t1.left, t2.left);
        parent.right = mergeTrees(t1.right, t2.right);
        return parent;
    }
}
