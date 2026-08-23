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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> elementQueue = new LinkedList<>();
        // add root to element Q
        elementQueue.add(root);
        int numberOfLevels = 0;

        while (true) {
            int nodeCountAtLevel = elementQueue.size();
            //if it is end of node then return numberOfLevel
            if (nodeCountAtLevel == 0) {
                return numberOfLevels;
            }
            //level order
            while (nodeCountAtLevel > 0) {
                TreeNode element = elementQueue.poll();

                if (element.left != null) {
                    elementQueue.add(element.left);
                }
                if (element.right != null) {
                    elementQueue.add(element.right);
                }
                nodeCountAtLevel--;
            }
            numberOfLevels++;

        }

    }
}