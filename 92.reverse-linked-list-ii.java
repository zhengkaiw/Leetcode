/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
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
    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        //first part
        ListNode cur1 = dummy;
        ListNode prev1 = null;
        for (int i = 0; i < m; i++) {
            prev1 = cur1;
            cur1 = cur1.next;
        }

        //second part
        ListNode cur2 = cur1;
        ListNode prev2 = prev1;
        for (int i = m; i <= n; i++) {
            ListNode next = cur2.next;
            cur2.next = prev2;
            prev2 = cur2;
            cur2 = next;
        }

        prev1.next = prev2;
        cur1.next = cur2;

        return dummy.next;
    }
}
// @lc code=end

