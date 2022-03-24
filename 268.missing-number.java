/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] array) {
       
        int n=array.length;
        int sum=(n*(n+1))/2;
        for(int i=0;i<array.length;i++){
            sum-=array[i];
        }
         return sum;
        
    }
}
// @lc code=end

