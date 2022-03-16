/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)return new int[]{-1,-1};
        int []ans={-1,-1};

        int lo=0;
        int hi=nums.length-1;

        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                hi=mid-1;
            }else if(nums[mid]<target){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
         lo=0;
         hi=nums.length-1;

        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                lo=mid+1;
            }else if(nums[mid]<target){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }

        return ans;
    }
}
// @lc code=end

