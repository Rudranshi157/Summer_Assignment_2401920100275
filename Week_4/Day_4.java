import java.util.*;
public class Day_4{

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
    // Path Sum
    // https://leetcode.com/problems/path-sum/
    // Time Complexity = O(n)    
    // Space Complexiy = O(n) 
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        
        int n = temperatures.length;
        int ans[] = new int[n];
        s.push(n-1);
        for(int i = n-2; i>=0; i--){
            while(!s.isEmpty() ){
                if(temperatures[s.peek()] > temperatures[i]){
                    ans[i] = s.peek()-i;
                    break;
                }else{
                    s.pop();
                }
            }
            s.push(i);
        }
        return ans;
    }

    // Question 2
    // Diameter of Binary Tree
    // https://leetcode.com/problems/diameter-of-binary-tree/
    // Time Complexity = O(n)   
    // Space Complexiy = O(n) 
    static class Info{
        int diam;
        int ht;

        public Info (int diam , int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public Info diam(TreeNode root){
        if(root == null){
            return new Info(0 ,0);
        }

        Info left = diam(root.left);
        Info right = diam(root.right);
        int diam = Math.max(Math.max(left.diam , right.diam) , left.ht + right.ht );
        int ht = Math.max(left.ht , right.ht) +1;
        return new Info(diam , ht);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Info res = diam(root);
        return res.diam;
    }

    // Question 3
    // Binary Tree Maximum Path Sum
    // https://leetcode.com/problems/binary-tree-maximum-path-sum/
    // Time Complexity = O(n)
    // Space Complexiy = O(n) 
    public int helper(TreeNode root, int[] arr){
        if(root == null) return 0;
        

        int left = helper(root.left, arr);
        int right = helper(root.right, arr);
        int ht =0;
        if(left > 0 && right > 0){
            arr[0] = Math.max(arr[0], right + left + root.val);
            ht = Math.max(right, left) + root.val;
        }else if(left > 0){
            arr[0] = Math.max(arr[0], left + root.val);
            ht = left + root.val;
        }else if(right > 0){
            arr[0] = Math.max(arr[0], right + root.val);
            ht = right + root.val;
        }else{
            arr[0] = Math.max(arr[0], root.val);
            ht = root.val;
        }
        return ht;
    }
    public int maxPathSum(TreeNode root) {
        int arr[] = new int[1];
        arr[0] =  Integer.MIN_VALUE;
        helper(root, arr);
        
        return arr[0];

    }

    public static void main(String[] args) {
        
    }
}