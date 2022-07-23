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
    TreeNode prev=null;
    TreeNode first=null;
    TreeNode second=null;
    void find(TreeNode root){
        if(root==null){
            return;
        }
        find(root.left);
        if(prev!=null && root.val<prev.val){
            if(first==null){
                first=prev;
            }
            second=root;
        }
        prev=root;
        find(root.right);
    }
    public void recoverTree(TreeNode root) {
        find(root);
        int temp=second.val;
        second.val=first.val;
        first.val=temp;
    }
}