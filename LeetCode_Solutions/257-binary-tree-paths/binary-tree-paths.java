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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> r=new ArrayList<>();
        if(root==null){
            return r;
        }
        else if(root.left==null && root.right==null){
            r.add(""+root.val);
            //System.out.println(r+" aa");
            return r;

        }
        List<String> left=binaryTreePaths(root.left);
        List<String> right=binaryTreePaths(root.right);
        for(String str:left){
            r.add(root.val+"->"+str);
           // System.out.println(r+" bb");
        }
        for(String str:right){
            r.add(root.val+"->"+str);
           // System.out.println(r);
        }
        return r;
    }
}