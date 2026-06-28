
public class Day_1{

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Question 1
    // Maximum Depth of Binary Tree
    // https://leetcode.com/problems/maximum-depth-of-binary-tree/
    // Time Complexity = O(n)    
    // Space Complexiy = O(1) 
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    // Question 2
    // Invert Binary Tree
    // https://leetcode.com/problems/invert-binary-tree/
    // Time Complexity = O(n)      
    // Space Complexiy = O(1) 
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        return prev;
    }


    // Question 3
    // Same Tree
    // https://leetcode.com/problems/same-tree/
    // Time Complexity = O(n)
    // Space Complexiy = O(1) 
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return head = slow;
    }

    public static void main(String[] args) {
        
    }
}