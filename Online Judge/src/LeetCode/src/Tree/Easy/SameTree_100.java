// Accepted
// Code from leetcode official solution pick, just for learning purpose.
// First problem from Tree section
// Posted in twitter
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/zT83t2Q4vK/
// Recursion is a good approach, just think about for current section


package Tree.Easy;

import Tree.TreeNode;

public class SameTree_100
{
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
