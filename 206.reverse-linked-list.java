/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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

    // iterative
    // public ListNode reverseList(ListNode head) { 
    //     ListNode dummy = null;
    //     while (head != null) {
    //         ListNode next = head.next;
    //         head.next = dummy;
    //         dummy = head;
    //         head = next;
    //     }
    //     return dummy;

        
    // }

    // recursive
    public ListNode reverseList(ListNode head) {
        return reverseNode(head, null);
    }

    private ListNode reverseNode(ListNode head, ListNode dummy) {
        if (head == null) return dummy;
        ListNode next = head.next;
        head.next = dummy;
        return reverseNode(next, head);
    }
}
// @lc code=end

