/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {

    public void merge(int[] ar1, int m, int[] ar2, int n) {

        int p1=m-1,p2=n-1,i=m+n-1;
        while(p2 >= 0){
            if(p1>=0 && ar1[p1]>ar2[p2]){
            ar1[i--]=ar1[p1--];
        }else{
            ar1[i--]=ar2[p2--];
        }
    }
    }
}
// @lc code=end
