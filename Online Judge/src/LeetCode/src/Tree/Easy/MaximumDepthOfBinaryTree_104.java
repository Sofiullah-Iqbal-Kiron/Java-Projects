// Accepted but took help from a discuss post
// Posted in twitter
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/JKqysVvrvN/


package Tree.Easy;

import Tree.TreeNode;

// Maximum depth of a binary tree is path length from root to farthest leaf node.

public class MaximumDepthOfBinaryTree_104
{
    public int maxDepth(TreeNode root)
    {
        Object x = null;
        if (root == x)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
