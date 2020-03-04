package leet;

import leet.model.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root){
        if(root == null) return false;

        if(isSymmetric(root.left) && isSymmetric(root.right))
            return true;

        return false;
    }
}
