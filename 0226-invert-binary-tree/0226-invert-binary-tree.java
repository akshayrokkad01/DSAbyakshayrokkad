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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        //add to Queue
        Queue<TreeNode> element = new LinkedList<>();
        element.add(root);
        while (!element.isEmpty()) {
            TreeNode node = element.poll();

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if(node.left!=null)
            {
                element.add(node.left);
            }
            if(node.right!=null)
            {
                element.add(node.right);
            }
        }
        return root;
    }
}