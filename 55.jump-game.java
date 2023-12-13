/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
       if (nums.length <= 1){
			return true;
       }
		int fnum = nums[0];
        if (fnum == 0){
            return false;
        }
		for (int i = 0; i < nums.length; i++) {
			if (fnum <= i && nums[i] == 0){
				return false;
            }
			if (i + nums[i] > fnum) {
				fnum = i + nums[i];
			}
			if (fnum >= nums.length - 1){
				return true;
            }
		}
		return false;
    }
}
// @lc code=end

