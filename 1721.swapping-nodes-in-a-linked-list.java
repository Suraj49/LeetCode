/*
 * @lc app=leetcode id=1721 lang=java
 *
 * [1721] Swapping Nodes in a Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        

        ListNode curr = head;
        ListNode pointer1 = head;
        ListNode pointer2= head;
        int count = 1;
        
        while( curr != null )
        {
            if( count < k )
            {
                pointer1 = pointer1.next;
            }
            if( count > k )
            {
                pointer2 = pointer2.next;
            }
            curr = curr.next;
            count++;
        }
        
        int temp = pointer1.val;
        pointer1.val = pointer2.val;
        pointer2.val = temp;
        
        return head;

    }
}
// @lc code=end

