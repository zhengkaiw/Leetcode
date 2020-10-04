/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null && cur.next.next != null) {
            ListNode first = cur.next;
            ListNode second = cur.next.next;
            cur.next = second;
            first.next = second.next;
            second.next = first;
            cur = first;
        }

        return dummy.next;
    }
}
// @lc code=end

