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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            List<List<Integer>> list=new ArrayList<>();
            return list;
        }
        List<List<Integer>> finalList=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        boolean reverse=false;
        q.add(root);
        while(q.isEmpty()==false){
            List<Integer> list=new ArrayList<>();
            int count=q.size();
            for(int i=0;i<count;i++){
                TreeNode curr=q.poll();
                if(reverse){
                    s.push(curr.val);
                }
                else{
                    list.add(curr.val);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(reverse){
                while(s.isEmpty()==false){
                    list.add(s.pop());
                }
            }
            reverse=!reverse;
            finalList.add(list);
        }
        return finalList;
    }
}