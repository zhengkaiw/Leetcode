/*
 * @lc app=leetcode id=1474 lang=java
 *
 * [1474] Delete N Nodes After M Nodes of a Linked List
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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode prev = null, cur = head;
        while (cur != null) {
            for (int i = 0; i < m; i++) {
                if (cur == null) break;
                prev = cur;
                cur = cur.next;
            }
            for (int i = 0; i < n; i++) {
                if (cur == null) break;
                cur = cur.next;
            }
            prev.next = cur;
        }
        return head; 
    }
}
// @lc code=end

