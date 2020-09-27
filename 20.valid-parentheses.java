import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else if (stack.isEmpty()) return false;
            else if (c == ')' && !stack.isEmpty() && stack.pop() != '(') return false;
            else if (c == '}' && !stack.isEmpty() && stack.pop() != '{') return false;
            else if (c == ']' && !stack.isEmpty() && stack.pop() != '[') return false;
        }
        return stack.empty();
    }
}
// @lc code=end

