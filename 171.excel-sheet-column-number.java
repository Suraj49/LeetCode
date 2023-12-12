/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        int p = 0;
        for( int index = s.length() - 1; index >= 0; index--){
            char c = s.charAt(index);
            int val = (int)c - 65 + 1;
            result += val * Math.pow(26, p);
            p++;

        }
        return result;
    }
}
// @lc code=end

