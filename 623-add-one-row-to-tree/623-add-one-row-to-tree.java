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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root==null) return new TreeNode(val);
        if(depth==1){
            TreeNode newNode=new TreeNode(val);
            newNode.left=root;
            return newNode;
        }
        
        Queue<TreeNode> queue=new LinkedList<>();
        int currDepth=1;
        queue.add(root);
        
        while(queue.isEmpty()==false){
            int size=queue.size();
            while(size-->0){
                TreeNode curr=queue.poll();
                if(currDepth==depth-1){
                    TreeNode left=curr.left;
                    TreeNode right=curr.right;
                    curr.left=new TreeNode(val);
                    curr.right=new TreeNode(val);
                    curr.left.left=left;
                    curr.right.right=right;
                }else{
                    if(curr.left!=null) queue.add(curr.left);
                    if(curr.right!=null) queue.add(curr.right);
                }
            }
            if(currDepth==depth-1) break;
            currDepth++;
        }
        return root;    
    }
}