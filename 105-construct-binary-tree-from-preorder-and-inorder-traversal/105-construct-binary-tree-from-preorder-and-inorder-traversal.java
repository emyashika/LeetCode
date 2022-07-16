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
    
    int preIndex=0;
    
    TreeNode get(int[] preorder,int[] inorder,int is, int ie){
        if(is>ie){
            return null;
        }
        TreeNode root=new TreeNode(preorder[preIndex++]);
        int inIndex=-1;
        for(int i=is;i<=ie;i++){
            if(inorder[i]==root.val){
                inIndex=i;
                break;
            }
        }
        root.left=get(preorder,inorder,is,inIndex-1);
        root.right=get(preorder,inorder,inIndex+1,ie);
        return root;
    } 
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length-1;
        return get(preorder,inorder,0,n);
    }
}