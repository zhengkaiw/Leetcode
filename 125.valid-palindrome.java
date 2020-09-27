/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {

        int left = 0, right = s.length() - 1;
        while (left <= right) {
            while (left <= right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left <= right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (left <= right && Character.toUpperCase(s.charAt(left)) != Character.toUpperCase(s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }
}
// @lc code=end

