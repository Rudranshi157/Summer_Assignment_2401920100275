import java.util.*;
public class Day_3{

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Question 1
    // Valid Parentheses
    // https://leetcode.com/problems/valid-parentheses/
    // Time Complexity = O(n)    
    // Space Complexiy = O(n) 
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        if(s.length()%2 !=0){
            return false;
        }
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if((ch==']' && stack.peek()=='[' ) || (ch=='}' && stack.peek()=='{') || (ch==')' && stack.peek()=='(')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    // Question 2
    // Min Stack
    // https://leetcode.com/problems/min-stack/
    // Time Complexity = O(1)   
    // Space Complexiy = O(n) 
    class MinStack {
        private List<int[]> st;

        public MinStack() {
            st = new ArrayList<>();
        }
        
        public void push(int value) {
            int[] top = st.isEmpty() ? new int[]{value, value} : st.get(st.size() - 1);
            int min_val = top[1];
            if (min_val > value) {
                min_val = value;
            }
            st.add(new int[]{value, min_val});
        }
        
        public void pop() {
            st.remove(st.size() - 1);
        }
        
        public int top() {
            return st.isEmpty() ? -1 : st.get(st.size() - 1)[0];
        }
        
        public int getMin() {
            return st.isEmpty() ? -1 : st.get(st.size() - 1)[1];
        }
    }

    // Question 3
    // Next Greater Element I
    // https://leetcode.com/problems/next-greater-element-i/
    // Time Complexity = O(n+m)
    // Space Complexiy = O(n+m) 
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n =  nums2.length;
        map.put(nums2[n-1],-1);
        s.push(nums2[n-1]);
       
        for(int i =n-2; i>=0; i--){
            int curr = nums2[i];
            int pop = -1;
            while(!s.isEmpty()){
                int p = s.pop();
                if(curr < p){
                    s.push(p);
                    pop = p;
                    break;
                }
            }
            map.put(nums2[i], pop);
            s.push(curr);
        }
        int res[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        
    }
}