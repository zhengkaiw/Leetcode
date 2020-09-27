/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        // Normal way
        // for (int i = 1; i <= n; i++) {
        //     if (i % 15 == 0) {
        //         res.add("FizzBuzz");
        //     } else if (i % 3 == 0) {
        //         res.add("Fizz");
        //     } else if (i % 5 == 0) {
        //         res.add("Buzz");
        //     } else {
        //         res.add(String.valueOf(i));
        //     }
        // }

        for (int i = 1, fizz = 0, buzz = 0; i <= n; i++) {
            fizz++;
            buzz++;
            if (fizz == 3  && buzz == 5) {
                res.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            } else if (fizz == 3) {
                res.add("Fizz");
                fizz = 0;
            } else if (buzz == 5) {
                res.add("Buzz");
                buzz = 0;
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
// @lc code=end

