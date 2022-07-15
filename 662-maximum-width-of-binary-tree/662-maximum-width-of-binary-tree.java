/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
      class Pair {
        TreeNode node;
        int index;
        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
         Queue<Pair> q = new ArrayDeque<Pair>();
        int res = 0;
        q.add(new Pair(root, 1));
        while (!q.isEmpty()) {
            int n = q.size();
            int left = 0, right = 0;
            for (int i = 0; i < n; i++) {
                Pair curr = q.remove();
                TreeNode node = curr.node;
                if (node.left != null) q.add(new Pair(node.left, 2 * (curr.index - 1) + 1));
                if (node.right != null) q.add(new Pair(node.right, 2 * (curr.index - 1) + 2));
                if (i == 0) left = curr.index;
                if (i == n - 1) right = curr.index;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}