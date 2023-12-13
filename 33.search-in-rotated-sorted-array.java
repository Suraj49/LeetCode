/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] n, int target) {
        int result = -1;
        for (int i = 0; i < n.length; i++ ){
            if(n[i]==target){
                return i;
            }
        }
        return result;
    }
}
// @lc code=end

