import java.awt.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=1019 lang=java
 *
 * [1019] Next Greater Node In Linked List
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
    // //inital
    // public int[] nextLargerNodes(ListNode head) {
    //     int length = 0;
    //     ListNode dummy = head;
    //     while (dummy != null) {
    //         dummy = dummy.next;
    //         length++;
    //     }
    //     int[] res = new int[length];
    //     for (int i = 0; i < length; i++) {
    //         res[i] = findNext(head);
    //         head = head.next;
    //     }
        
    //     return res;
    // }

    // private int findNext(ListNode head) {
    //     if (head.next == null) return 0;
    //     ListNode cur = head.next;
    //     while (cur != null) {
    //         if (cur.val > head.val) return cur.val;
    //         cur = cur.next;
    //     }
    //     return 0;
    // }

    // time: O(N) space: O(N)
    public int[] nextLargerNodes(ListNode head) {
        if (head == null) return new int[]{};

        List<Integer> list = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) {
            list.add(node.val);
        }

        int[] res = new int[list.size()];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < res.length; i++) {
            while (!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) {
                res[stack.pop()] = list.get(i);
            }
            stack.push(i);
        }
        return res;
    }
}
// @lc code=end

