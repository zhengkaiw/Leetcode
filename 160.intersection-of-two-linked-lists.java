import sun.security.provider.DSAKeyPairGenerator.Legacy;

/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // // without length
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     if (headA == null || headB == null) {
    //         return null;
    //     }
    //     ListNode a = headA;
    //     ListNode b = headB;
    //     while (a != b) {
    //         a = a == null ? headB : a.next;
    //         b = b == null ? headA : b.next;
    //     }
    //     return a;
    // }

    // with length
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int lengthA = length(headA);
        int lengthB = length(headB);
        
        while (lengthA > lengthB) {
            headA = headA.next;
            lengthA--;
        }

        while (lengthB > lengthA) {
            headB = headB.next;
            lengthB--;
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    private int length(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
}
// @lc code=end

