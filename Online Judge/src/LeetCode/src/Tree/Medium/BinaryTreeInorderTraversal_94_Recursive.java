// Accepted with leetcode official recursive solution
// Posted in twitter
// Ubuntu Pastebin: https://pastebin.ubuntu.com/p/vVQqswQZnp/


package Tree.Medium;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_94_Recursive {
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            helper(root, ans);

            return ans;
        }

        private void helper(TreeNode root, List<Integer> list) {
            if (root != null) {
                if (root.left != null) helper(root.left, list);
                list.add(root.val);
                if (root.right != null) helper(root.right, list);
            }
        }
    }
}
