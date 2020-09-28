/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return dummy.next;
    }

    // // recursive (not recommend)
    // public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //     if (l1 == null) return l2;
    //     if (l2 == null) return l1;
    //     ListNode dummy;
    //     if (l1.val <= l2.val) {
    //         dummy = l1;
    //         dummy.next = mergeTwoLists(l1.next, l2);
    //     } else {
    //         dummy = l2;
    //         dummy.next = mergeTwoLists(l1, l2.next);
    //     }

    //     return dummy;
    // }
}
// @lc code=end

