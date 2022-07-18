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
    boolean findPath(TreeNode root, ArrayList<TreeNode> path, TreeNode n){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root==n){
            return true;
        }
        if(findPath(root.left,path,n)||findPath(root.right,path,n)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> p1=new ArrayList<TreeNode>();
        ArrayList<TreeNode> p2=new ArrayList<TreeNode>();
        if(findPath(root,p1,p)==false || findPath(root,p2,q)==false){
            return null;
        }
        int length=Math.min(p1.size(),p2.size());
        int i;
        for(i=1;i<length;i++){
            if(p1.get(i)!=p2.get(i)){
                return p1.get(i-1);
            }
        }
        i--;
        if(p1.get(i)==p2.get(i)){
            return p1.get(i);
        }
        return null;
    }
}