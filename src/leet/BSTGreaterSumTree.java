package leet;

import leet.model.TreeNode;

public class BSTGreaterSumTree {
    int sum;

    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        helper(root);
        return root;
    }

    public void helper(TreeNode curr) {
        if(curr==null) return;
        helper(curr.right);
        curr.val += sum;
        sum = curr.val;
        helper(curr.left);
    }


}

