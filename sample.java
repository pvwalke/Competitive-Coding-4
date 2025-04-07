// Time Complexity : O(N) N is the number of TreeNodes
// Space Complexity : O(N) Recursion stack
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Using DFS (PostOrder traversal) I figured out the height of
// left and  right subtree and if the diff is > 1 returned -1 (indicating tree is not balanced)

class Solution {
    public boolean isBalanced(TreeNode root) {
        //helper - recurse
        return isBalancedBinaryTree(root) != -1;
    }

    private int isBalancedBinaryTree(TreeNode root){
        //base case
        if(root == null) return 0;
        //left recurse - return int
        int leftTree = isBalancedBinaryTree(root.left);
        //right recurse - return int
        int rightTree = isBalancedBinaryTree(root.right);
        // condition check - Math.abs(left - right) > 1

        if(leftTree == -1 || rightTree == -1 ) return -1;
        if(Math.abs(leftTree - rightTree) > 1) return -1;
        // return - 1 + max(letf, right)

        return 1 + Math.max(leftTree,rightTree);

    }
}
