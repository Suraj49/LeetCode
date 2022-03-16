/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
        int len=nums1.length+nums2.length;
        int []mrge =new int[len];
        int i=0;
        int j=0;
        int k=0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i]<nums2[j]){
                mrge[k]=nums1[i];
                i++;
                k++;

            }else{
                mrge[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            mrge[k]=nums1[i];
                i++;
                k++;
        }
        while(j<nums2.length){
            mrge[k]=nums2[j];
                j++;
                k++;
        }
        double midNo=0.0;
        int mid=mrge.length/2;

        if(mrge.length % 2==1){

            midNo=mrge[mid];
       
        }else if(mrge.length % 2 == 0){

            midNo=(mrge[mid]+mrge[mid-1])/2.0;

        }

         return midNo;
    }
}
// @lc code=end

