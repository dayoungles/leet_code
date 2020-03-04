package leet;

import leet.model.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsSubTreeTest {

    @Test
    public void isSubtree() {
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(5);
//
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(2);
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(1);
        IsSubTree a = new IsSubTree();
        a.isSubtree(root, root.left);
    }
}