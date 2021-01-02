// Time Complexity - O(n) n is the number of nodes in original tree
// Space Complexity - O(H) h is height of tree for recursion stack

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
	TreeNode res, target;
	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
		this.target = target;
		findCorrNode(original, cloned);
		return res;
	}

	private void findCorrNode(TreeNode o, TreeNode c) {
		if (o != null) {
			findCorrNode(o.left, c.left);
			if (o == target) {
				res = c;
			}
			findCorrNode(o.right, c.right);
		}
	}
}