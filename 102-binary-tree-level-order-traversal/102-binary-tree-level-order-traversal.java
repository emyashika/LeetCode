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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> finalList=new ArrayList<>();
        if(root==null){
            return finalList;
        }
        q.add(root);
        while(q.isEmpty()==false){
            List<Integer> list=new ArrayList<>();
            int count=q.size();
            for(int i=0;i<count;i++){
            TreeNode curr=q.poll();
                    list.add(curr.val);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            }
            finalList.add(list);
        }
        return finalList;
    }
}