
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
    // Linked List Cycle
    // https://leetcode.com/problems/linked-list-cycle/
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
    // Reverse Linked List
    // https://leetcode.com/problems/reverse-linked-list/
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
    // Middle of the Linked List
    // https://leetcode.com/problems/middle-of-the-linked-list/
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