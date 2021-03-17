// Accepted but the code I take from official leetcode solve pick just for learning purpose
// Posted in twitter
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/VTJCdWb9M3/


package Tree.Easy;

// A binary tree is symmetric if the left subtree is a mirror reflection of right subtree.

import Tree.TreeNode;

public class SymmetricTree_101
{
    public boolean isSymmetric(TreeNode root)
    {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode one, TreeNode two)
    {
        if (one == null && two == null)
            return true;
        if (one == null || two == null)
            return false;

        return (one.val == two.val) && isMirror(one.left, two.right) && isMirror(one.right, two.left);
    }
}
