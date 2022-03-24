/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] a) {
        int Maj=-1,vote=0;
        int size=a.length;
        
        for(int i=0;i<size;i++){
            
            if(vote == 0){
                Maj = a[i];
                vote=1;
            }
            
            else if(a[i] != Maj)
                vote--;
            else
                vote++;
                
           
        }
        
        int cnt=0;
        for(int i=0;i<size;i++)
            if(a[i] == Maj)
                cnt++;
                
        return cnt>(size/2)?Maj:-1;
    }
}
// @lc code=end

