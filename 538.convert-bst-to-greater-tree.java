/*
 * @lc app=leetcode id=538 lang=java
 *
 * [538] Convert BST to Greater Tree
 */

// @lc code=start
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
    public TreeNode convertBST(TreeNode root) {
      reversedInorder(root);
      return root;
    }
  
    private int prefix = 0;
  
    private void reversedInorder(TreeNode root) {
      if (root == null)
        return;
  
      reversedInorder(root.right);
      prefix += root.val;
      root.val = prefix;
      reversedInorder(root.left);
    }
  }
// @lc code=end

