/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {

        if (k == 0 || head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count = 0;
        ListNode end = dummy;
        while (end.next != null) {
            end = end.next;
            count++;
        }
        end.next = head;
        for (int i = 0; i < count - k % count; i++) {
            end = end.next;
        }
        dummy.next = end.next;
        end.next = null;
        return dummy.next;
    }
}
// @lc code=end

