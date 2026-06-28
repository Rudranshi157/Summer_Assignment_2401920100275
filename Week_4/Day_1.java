
public class Day_1{

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
 

    

    // Question 1
    // Maximum Depth of Binary Tree
    // https://leetcode.com/problems/maximum-depth-of-binary-tree/
    // Time Complexity = O(n)    
    // Space Complexiy = O(1) 
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left) ,maxDepth(root.right))+1;
    }


    // Question 2
    // Invert Binary Tree
    // https://leetcode.com/problems/invert-binary-tree/
    // Time Complexity = O(n)      
    // Space Complexiy = O(1) 
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.right = invertTree(left);
        root.left = invertTree(right);
        return root;

    }


    // Question 3
    // Same Tree
    // https://leetcode.com/problems/same-tree/
    // Time Complexity = O(n)
    // Space Complexiy = O(1) 
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q == null){
            return true;
        }else if(p == null || q==null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
    }

    public static void main(String[] args) {
        
    }
}