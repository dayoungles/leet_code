package leet;

import leet.model.TreeNode;

public class IsSubTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null|| t == null) return false;

        return isSameNode(s, t);

    }

    private boolean isSameNode(TreeNode s, TreeNode t){
        if(s== null && t == null) return true;
        if(s == null || t == null) return false;

        if(s.val == t.val){
            boolean left = isSameNode(s.left, t.left);
            boolean right = isSameNode(s.right, t.right);

            if(left && right) {
                return true;
            } else {
                boolean left = isSameNode(s.left, t);
                boolean right = isSameNode(s.right, t);
                if(left || right){
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            boolean left = isSameNode(s.left, t);
            boolean right = isSameNode(s.right, t);
            if(left || right){
                return true;
            } else {
                return false;
            }
        }

    }
}
