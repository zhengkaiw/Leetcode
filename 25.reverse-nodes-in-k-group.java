/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while (head != null) {
            head = reverseNextK(head, k);
        }
        return dummy.next;
    }

    // head -> n1 -> n2 .. nk -> nk+1 ...
    // =>
    // head -> nk -> nk-1 .. n1 -> nk+1 ...
    // return n1
    private ListNode reverseNextK(ListNode head, int k) {
        ListNode n1 = head.next;
        ListNode nk = head;
        for (int i = 0; i < k; i++) {
            nk = nk.next;
            if (nk == null) {
                return null;
            }
        }
        
        ListNode prev = null;
        ListNode cur = n1;
        ListNode nkplus = nk.next;
        while (cur != nkplus) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        head.next = nk;
        n1.next = nkplus;

        return n1;
    }
}
// @lc code=end

