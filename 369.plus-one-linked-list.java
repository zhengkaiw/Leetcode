/*
 * @lc app=leetcode id=369 lang=java
 *
 * [369] Plus One Linked List
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
    // // reverse
    // public ListNode plusOne(ListNode head) {
    //     ListNode dummy = new ListNode(0);
    //     head = reverse(head);
    //     dummy.next = head;
    //     ListNode node = head;
    //     boolean plus = true;
    //     while (node != null) {
    //         if (node.next == null && plus && node.val == 9) {
    //             node.val = 0;
    //             node.next = new ListNode(1);
    //             break;
    //         }
    //         if (node.val != 9 && plus) {
    //             node.val++;
    //             plus = false;
    //         } else if (node.val == 9) {
    //             if (plus) {
    //                 node.val = 0;
    //             }
    //         }
    //         node = node.next;
    //     }
        
    //     return reverse(dummy.next);
    // }

    // private ListNode reverse(ListNode head) {
    //     ListNode dummy = null;
    //     while (head != null) {
    //         ListNode next = head.next;
    //         head.next = dummy;
    //         dummy = head;
    //         head = next;
    //     }
    //     return dummy;
    // }

    public ListNode plusOne(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode i = dummy;
        ListNode j = dummy;

        while (j.next != null) {
            j = j.next;
            if (j.val != 9) {
                i = j;
            }
        }
        i.val++;
        i = i.next;
        while (i != null) {
            i.val = 0;
            i = i.next;
        }
        if (dummy.val == 0) return dummy.next;
        else return dummy;
    }
}
// @lc code=end

