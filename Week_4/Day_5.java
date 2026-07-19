public class Day_5{

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
    // Symmetric Tree
    // https://leetcode.com/problems/symmetric-tree/description/
    // Time Complexity = O(n)    
    // Space Complexiy = O(1) 
    public boolean isSame(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        else if(left == null || right == null) return false;
        if(left.val == right.val){
            return isSame(left.left, right.right) && isSame(left.right, right.left);
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return isSame(root.left, root.right);
    }

    // Question 2
    // Construct Binary Tree from Preorder and Inorder Traversal
    // https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
    // Time Complexity = O(1)   
    // Space Complexiy = O(n) 
    class RecentCounter {
        private static final int[] records = new int[10000]; 
        private int start;
        private int end;
        
        public RecentCounter() {        
            start = 0;
            end = 0;
        }
        
        
        public int ping(int t) {
            while (start < end && (t - records[start] > 3000)) { 
                start++; 
            }
            records[end++] = t;
            return end - start;
        }
    }

    // Question 3
    // Sliding Window Maximum
    // https://leetcode.com/problems/sliding-window-maximum/
    // Time Complexity = O(n)
    // Space Complexiy = O(n) 
    class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - k + 1]; 
       
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0]; 
        right[n - 1] = nums[n - 1];
        
        for (int i = 1; i < n; ++i) {
           
            if (i % k == 0) left[i] = nums[i];
            else            left[i] = Math.max(left[i - 1], nums[i]);
            
            int j = n - i - 1;
            if (j % k == (k - 1)) right[j] = nums[j];
            else                  right[j] = Math.max(right[j + 1], nums[j]);
        }
        
        
        for (int i = 0, j = i + k - 1; j < n; ++i, ++j) {
            result[i] = Math.max(right[i], left[j]);
        }
        
        return result;
        }
}

    public static void main(String[] args) {
        
    }
}