/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] a, int k) {
        int n=a.length;
        k = k % a.length;
        if (k < 0) {
           k += a.length;
       }
       reverse(a, 0, n - k - 1);
       reverse(a, n - k, n - 1);
       reverse(a, 0, n- 1);
   }
    private static void reverse(int[] a, int i, int j) {

       while (i < j) {
           int temp = a[i];
           a[i] = a[j];
           a[j] = temp;
           i++;
           j--;
       }
    }
}
// @lc code=end

