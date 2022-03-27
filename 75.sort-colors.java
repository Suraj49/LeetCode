import java.time.temporal.Temporal;

/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
            case 0: {
                temp = a[lo];
                a[lo] = a[mid];
                a[mid] = temp;
                lo++;
                mid++;
                break;
            }
            case 1:
                mid++;
                break;
            case 2: {
                temp = a[mid];
                a[mid] = a[hi];
                a[hi] = temp;
                hi--;
                break;
            }
            }
        
        }
    }
}
// @lc code=end

