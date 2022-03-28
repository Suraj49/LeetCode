import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;

/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int []>res=new ArrayList<>();
        if(intervals.length==0||intervals==null)
            return res.toArray(new int[0][]);

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int []i : intervals){
            if(i[0]<=end){
            end=Math.max(end, i[1]);
            }else{
                res.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
}
// @lc code=end

